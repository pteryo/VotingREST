package ru.topjava.poller.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "menu")
public class Menu extends AbstractEntity {

    @OneToOne
    @JoinColumn(name = "place_id", nullable = false)
    private Place place;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
