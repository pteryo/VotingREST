package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.poller.model.MenuEntry;

public interface CrudMenuEntryRepository extends JpaRepository<MenuEntry, Integer> {
    MenuEntry getReferenceById(Integer id);

     getAllByMenuId( );
}
