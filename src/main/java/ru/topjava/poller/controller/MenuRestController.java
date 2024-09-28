package ru.topjava.poller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.topjava.poller.model.Menu;
import ru.topjava.poller.service.MenuService;

@RestController
@RequestMapping(value = MenuRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class MenuRestController {
    static final String REST_URL = "/Places/{PlaceId}/menu";
    private final MenuService service;

    public MenuRestController(MenuService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Menu get(@PathVariable int PlaceId, @PathVariable int id) {
        return service.get(id, PlaceId);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Menu create(@Validated @RequestBody Menu menu, @PathVariable int PlaceId) {
        return service.create(menu, PlaceId);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Validated @RequestBody Menu menu, @PathVariable int PlaceId, @PathVariable int id) {
        service.update(menu, PlaceId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int PlaceId, @PathVariable int id) {
        service.delete(id, PlaceId);
    }

    @GetMapping("/{id}/with-Place")
    public Menu getWithPlace(@PathVariable int PlaceId, @PathVariable int id) {
        return service.getWithPlace(id, PlaceId);
    }
}
