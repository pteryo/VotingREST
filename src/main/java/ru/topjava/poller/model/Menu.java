package ru.topjava.poller.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "menu")
public class Menu extends AbstractEntity {
 
    @OneToOne
    @JoinColumn(name = "place_id", nullable = false)
    private Place place;

    @OneToMany(mappedBy = "menu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MenuEntry> items;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public List<MenuEntry> getItems() {
        return items;
    }

    public void setItems(List<MenuEntry> items) {
        this.items = items;
    }


}
