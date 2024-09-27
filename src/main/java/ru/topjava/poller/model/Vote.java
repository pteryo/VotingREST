package ru.topjava.poller.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import ru.topjava.poller.model.Place;
import ru.topjava.poller.model.User;

@Entity
@Table(name = "votes")
public class Vote {
    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "place_id", nullable = false)
    private Place Place;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Place getPlace() {
        return Place;
    }

    public void setPlace(Place place) {
        Place = place;
    }



}
