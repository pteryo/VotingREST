package ru.topjava.poller.service;

import org.springframework.stereotype.Service;
import ru.topjava.poller.repository.MenuItemRepository;

@Service
public class MenuItemService {
    private final MenuItemRepository repository;

    public MenuItemService(MenuItemRepository repository) {
        this.repository = repository;
    }

}
