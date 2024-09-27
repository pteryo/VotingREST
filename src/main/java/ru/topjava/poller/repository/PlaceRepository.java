package ru.topjava.poller.repository;

import org.springframework.stereotype.Repository;
import ru.topjava.poller.model.Place;
import ru.topjava.poller.repository.crud.CrudPlaceRepository;

@Repository
public class PlaceRepository extends AbstractRepository<Place, Integer> {

    private final CrudPlaceRepository crudPlaceRepository;

    public PlaceRepository(CrudPlaceRepository crudPlaceRepository) {
        super(crudPlaceRepository);
        this.crudPlaceRepository = crudPlaceRepository;
    }
}