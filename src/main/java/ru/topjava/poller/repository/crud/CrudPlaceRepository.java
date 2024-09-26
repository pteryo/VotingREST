package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.poller.model.Place;

public interface CrudPlaceRepository extends JpaRepository<Place, Integer> {
    Place getReferenceById(Integer id);
}
