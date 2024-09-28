package ru.topjava.poller.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.topjava.poller.model.MenuEntry;
import ru.topjava.poller.repository.crud.CrudMenuEntryRepository;
import ru.topjava.poller.repository.crud.CrudMenuRepository;

import java.util.List;

@Repository
public class MenuEntryRepository extends AbstractRepository<MenuEntry, Integer> {

    private final CrudMenuEntryRepository crudMenuEntryRepository;
    private final CrudMenuRepository crudMenuRepository;

    public MenuEntryRepository(CrudMenuEntryRepository crudMenuEntryRepository, CrudMenuRepository crudMenuRepository) {
        super(crudMenuEntryRepository);
        this.crudMenuEntryRepository = crudMenuEntryRepository;
        this.crudMenuRepository = crudMenuRepository;
    }
    public MenuEntry get(Integer id, Integer menuId) {
        return crudMenuEntryRepository.findById(id)
                .filter(menuEntry -> menuEntry.getMenu().getId().equals(menuId))
                .orElse(null);
    }

    public List<MenuEntry> getAll(Integer menuId) {
        return crudMenuEntryRepository.getAllByMenuId(menuId);
    }

    @Transactional
    public MenuEntry save(MenuEntry menuEntry, Integer menuId) {
        if (menuEntry.isInitialised() && get(menuEntry.getId(), menuId) == null) {
            return null;
        }
        menuEntry.setMenu(crudMenuRepository.getReferenceById(menuId));
        return crudMenuEntryRepository.save(menuEntry);
    }
}

