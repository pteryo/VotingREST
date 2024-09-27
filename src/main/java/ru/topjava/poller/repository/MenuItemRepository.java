package ru.topjava.poller.repository;

import org.springframework.stereotype.Repository;
import ru.topjava.poller.model.MenuEntry;
import ru.topjava.poller.repository.crud.CrudMenuItemRepository;
import ru.topjava.poller.repository.crud.CrudMenuRepository;

@Repository
public class MenuItemRepository extends AbstractRepository<MenuEntry, Integer> {

    private final CrudMenuItemRepository crudMenuItemRepository;
    private final CrudMenuRepository crudMenuRepository;

    public MenuItemRepository(CrudMenuItemRepository crudMenuItemRepository, CrudMenuRepository crudMenuRepository) {
        super(crudMenuItemRepository);
        this.crudMenuItemRepository = crudMenuItemRepository;
        this.crudMenuRepository = crudMenuRepository;
    }
}

