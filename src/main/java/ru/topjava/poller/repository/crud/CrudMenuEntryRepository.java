package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.topjava.poller.model.MenuEntry;

import java.util.List;

public interface CrudMenuEntryRepository extends JpaRepository<MenuEntry, Integer> {
    MenuEntry getReferenceById(Integer id);

    @Query("SELECT m FROM MenuEntry m WHERE m.menu.id=:menuId ORDER BY mi.name")
    List<MenuEntry> getAllByMenuId(@Param("menuId") Integer menuId);

    @Modifying
    @Transactional
    @Query("DELETE FROM MenuEntry m WHERE m.id=:id AND m.menu.id=:menuId")
    int delete(@Param("id") Integer id, @Param("menuId") Integer menuId);
}
