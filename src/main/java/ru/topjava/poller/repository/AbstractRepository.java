package ru.topjava.poller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractRepository<E, ID> {
    protected final JpaRepository<E, ID> repository;
    public E save(E entity) {
        return repository.save(entity);
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }

    public E get(ID id) {
        return repository.findById(id).orElse(null);
    }

}
