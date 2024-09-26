package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.poller.model.Vote;

public interface CrudVoteRepository extends JpaRepository<Vote, Integer> {
    Vote findByUserId(Integer userId);

    Vote getReferenceById(Integer id);
}