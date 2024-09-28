package ru.topjava.poller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.topjava.poller.model.MenuEntry;
import ru.topjava.poller.service.MenuEntryService;

import java.util.List;

@RestController
@RequestMapping(value = MenuEntryRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuEntryRestController {
    static final String REST_URL = "/menu/{menuId}/menu-items";
    private final MenuEntryService service;

    public MenuEntryRestController(MenuEntryService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public MenuEntry get(@PathVariable int menuId, @PathVariable int id) {
        return service.get(id, menuId);
    }

    @GetMapping
    public List<MenuEntry> getAll(@PathVariable int menuId) {
        return service.getAll(menuId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public MenuEntry create(@Validated @RequestBody MenuEntry menuEntry, @PathVariable int menuId) {
        return service.create(menuEntry, menuId);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Validated @RequestBody MenuEntry menuEntry, @PathVariable int menuId, @PathVariable int id) {
        service.update(menuEntry, menuId, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int menuId, @PathVariable int id) {
        service.delete(id, menuId);
    }
}