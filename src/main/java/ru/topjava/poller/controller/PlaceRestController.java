package ru.topjava.poller.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.topjava.poller.model.Place;
import ru.topjava.poller.service.PlaceService;

import java.util.List;

@RestController
@RequestMapping(value = PlaceRestController.REST_URL, produces = MediaType.APPLICATION_JSON_VALUE)
public class PlaceRestController {
    static final String REST_URL = "/Places";
    private final PlaceService service;

    public PlaceRestController(PlaceService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Place get(@PathVariable int id) {
        return service.get(id);
    }

    @GetMapping
    public List<Place> getAll() {
        return service.getAll();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Place create(@Validated @RequestBody Place Place) {
        return service.create(Place);
    }

    @PutMapping(value = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void update(@Validated @RequestBody Place Place, @PathVariable int id) {
        Place.setId(id);
        service.update(Place);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable int id) {
        service.delete(id);
    }

    @GetMapping("/{id}/reference")
    public Place getReferenceById(@PathVariable int id) {
        return service.getReferenceById(id);
    }
}