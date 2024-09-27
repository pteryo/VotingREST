package ru.topjava.poller.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.topjava.poller.model.Place;
import ru.topjava.poller.repository.PlaceRepository;
import ru.topjava.poller.util.ValidationUtil;

import java.util.List;

import static ru.topjava.poller.util.ValidationUtil.checkNotFoundWithId;

public class PlaceService {

    private final PlaceRepository repository;

    public PlaceService(PlaceRepository repository) {
        this.repository = repository;
    }

    public Place get(Integer id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public void delete(Integer id) {
        checkNotFoundWithId(repository.get(id), id);
        repository.delete(id);
    }

    public List<Place> getAll() {
        return repository.getAll();
    }

    public void update(Place Place) {
        Assert.notNull(Place, "Place must not be null");
        checkNotFoundWithId(repository.save(Place), Place.getId());
    }

    public Place create(Place Place) {
        Assert.notNull(Place, "Place must not be null");
        ValidationUtil.checkNew(Place);
        return repository.save(Place);
    }

    public Place getReferenceById(Integer id) {
        return checkNotFoundWithId(repository.getReferenceById(id), id);
    }
}