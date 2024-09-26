package ru.topjava.poller.model;

import ru.topjava.poller.model.Place;
import ru.topjava.poller.model.User;

public class Vote {

    private User user;
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
