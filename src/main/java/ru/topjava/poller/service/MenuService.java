package ru.topjava.poller.service;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.topjava.poller.model.Menu;
import ru.topjava.poller.repository.MenuRepository;
import ru.topjava.poller.util.ValidationUtil;

import static ru.topjava.poller.util.ValidationUtil.checkNotFoundWithId;

@Service
public class MenuService {

    private final MenuRepository repository;

    public MenuService(MenuRepository repository) {
        this.repository = repository;
    }

    public Menu get(Integer id, Integer PlaceId) {
        return ValidationUtil.checkNotFoundWithId(repository.get(id, PlaceId), id);
    }

    public void delete(Integer id, Integer PlaceId) {
        checkNotFoundWithId(repository.delete(id, PlaceId), id);
    }


    public void update(Menu menu, Integer PlaceId) {
        Assert.notNull(menu, "menu must not be null");
        ValidationUtil.checkNotFoundWithId(repository.save(menu, PlaceId), menu.getId());
    }

    public Menu create(Menu menu, Integer PlaceId) {
        Assert.notNull(menu, "menu must not be null");
        return repository.save(menu, PlaceId);
    }

    public Menu getWithPlace(Integer id, Integer PlaceId) {
        return ValidationUtil.checkNotFoundWithId(repository.getWithPlace(id, PlaceId), id);
    }
}
