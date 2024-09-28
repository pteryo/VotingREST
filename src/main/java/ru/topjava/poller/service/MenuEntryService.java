package ru.topjava.poller.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.topjava.poller.model.MenuEntry;
import ru.topjava.poller.repository.MenuEntryRepository;
import ru.topjava.poller.util.ValidationUtil;

import java.time.LocalDateTime;
import java.util.List;

import static ru.topjava.poller.util.ValidationUtil.checkListNotEmpty;
import static ru.topjava.poller.util.ValidationUtil.checkNotFoundWithId;

@Service
public class MenuEntryService {

    private final MenuEntryRepository repository;

    public MenuEntryService(MenuEntryRepository repository) {
        this.repository = repository;
    }

    public MenuEntry get(Integer id, Integer menuId) {
        return checkNotFoundWithId(repository.get(id, menuId), id);
    }

    private static void setCurrentLocalDateTime(MenuEntry menuEntry) {
        menuEntry.setCreatedAt(LocalDateTime.now());
    }

    public List<MenuEntry> getAll(Integer menuId) {
        return checkListNotEmpty(repository.getAll(menuId), menuId);
    }

    public MenuEntry create(MenuEntry menuEntry, Integer menuId) {
        Assert.notNull(menuEntry, "menuEntry must not be null");
        ValidationUtil.checkNew(menuEntry);
//        setCurrentLocalDateTime(menuEntry);
        return repository.save(menuEntry, menuId);
    }

    public void update(MenuEntry menuEntry, Integer menuId, Integer menuEntryId) {
        Assert.notNull(menuEntry, "menuEntry must not be null");
        setCurrentLocalDateTime(menuEntry);
        menuEntry.setId(menuEntryId);
        checkNotFoundWithId(repository.save(menuEntry, menuId), menuEntry.getId());
    }

    public void delete(Integer id, Integer menuId) {
        checkNotFoundWithId(repository.delete(id, menuId), id);
    }
}
