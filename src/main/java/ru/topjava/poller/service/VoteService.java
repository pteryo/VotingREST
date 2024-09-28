package ru.topjava.poller.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.topjava.poller.model.Vote;
import ru.topjava.poller.repository.VoteRepository;
import ru.topjava.poller.util.ValidationUtil;

import java.util.List;

import static ru.topjava.poller.util.ValidationUtil.checkNotFoundWithId;


@Service
public class VoteService {

    private final VoteRepository repository;

    public VoteService(VoteRepository repository) {
        this.repository = repository;
    }

    public Vote get(Integer id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public void delete(Integer id) {
        checkNotFoundWithId(repository.get(id), id);
        repository.delete(id);
    }

    public void update(Vote vote) {
        Assert.notNull(vote, "Vote must not be null");
        checkNotFoundWithId(repository.save(vote), vote.getId());
    }

    public Vote create(Vote vote) {
        Assert.notNull(vote, "Vote must not be null");
        ValidationUtil.checkNew(vote);
        return repository.save(vote);
    }

    public List<Vote> getAll() {
        return repository.getAll();
    }

    public Vote findByUserId(Integer userId) {
        Assert.notNull(userId, "User ID must not be null");
        return ValidationUtil.checkNotFoundWithId(repository.findByUserId(userId), -1);
    }
}
