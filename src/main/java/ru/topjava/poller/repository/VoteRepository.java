package ru.topjava.poller.repository;

import org.springframework.stereotype.Repository;
import ru.topjava.poller.model.Vote;
import ru.topjava.poller.repository.crud.CrudVoteRepository;

@Repository
public class VoteRepository extends AbstractRepository<Vote, Integer> {

    private final CrudVoteRepository crudVoteRepository;

    public VoteRepository(CrudVoteRepository crudVoteRepository) {
        super(crudVoteRepository);
        this.crudVoteRepository = crudVoteRepository;
    }

    public Vote findByUserId(Integer userId) {
        return crudVoteRepository.findByUserId(userId);
    }
}
