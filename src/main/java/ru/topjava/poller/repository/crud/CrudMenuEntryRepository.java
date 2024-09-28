package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.topjava.poller.model.MenuEntry;

import java.util.List;

public interface CrudMenuEntryRepository extends JpaRepository<MenuEntry, Integer> {
    MenuEntry getReferenceById(Integer id);

    @Query("SELECT m FROM MenuEntry m WHERE m.menu.id=:menuId ORDER BY mi.name")
    List<MenuEntry> getAllByMenuId(@Param("menuId") Integer menuId);
}
