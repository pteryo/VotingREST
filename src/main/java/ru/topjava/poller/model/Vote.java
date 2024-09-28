package ru.topjava.poller.model;

import jakarta.persistence.*;

@Entity
@Table(name = "vote")
public class Vote extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @JoinColumn(name = "place_id", nullable = false)
    private Place place;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
