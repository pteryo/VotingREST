package ru.topjava.poller.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.topjava.poller.model.User;
import ru.topjava.poller.repository.UserRepository;
import ru.topjava.poller.util.ValidationUtil;

import java.util.List;

import static ru.topjava.poller.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User get(Integer id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public void delete(Integer id) {
        checkNotFoundWithId(repository.get(id), id);
        repository.delete(id);
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    public void update(User user) {
        Assert.notNull(user, "User must not be null");
        checkNotFoundWithId(repository.save(user), user.getId());
    }

    public User create(User user) {
        Assert.notNull(user, "User must not be null");
        ValidationUtil.checkNew(user);
        return repository.save(user);
    }

    public User findByUsername(String username) {
        Assert.hasText(username, "Username must not be empty");
        return checkNotFoundWithId(repository.findByUsername(username), -1);
    }
}