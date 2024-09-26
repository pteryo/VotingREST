package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.poller.model.User;

public interface CrudUserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);

    User getReferenceById(Integer id);
}
