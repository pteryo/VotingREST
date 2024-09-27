package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.topjava.poller.model.Menu;

public interface CrudMenuRepository extends JpaRepository<Menu, Integer> {
    @Modifying
    @Transactional
    @Query("DELETE FROM Menu m WHERE m.id=:id AND m.Place.id=:PlaceId")
    int delete(@Param("id") Integer id, @Param("PlaceId") Integer PlaceId);

    Menu getReferenceById(Integer id);

    @Query("SELECT m FROM Menu m JOIN FETCH m.Place WHERE m.id = ?1 and m.Place.id = ?2")
    Menu getWithPlace(Integer id, Integer PlaceId);
}