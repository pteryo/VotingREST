package ru.topjava.poller.repository;

import org.springframework.stereotype.Repository;
import ru.topjava.poller.model.User;
import ru.topjava.poller.repository.crud.CrudUserRepository;

@Repository
public class UserRepository extends AbstractRepository<User, Integer> {

    private final CrudUserRepository crudUserRepository;

    public UserRepository(CrudUserRepository crudUserRepository) {
        super(crudUserRepository);
        this.crudUserRepository = crudUserRepository;
    }

    public User findByUsername(String username) {
        return crudUserRepository.findByUsername(username);
    }
}
