package ru.topjava.poller.model;

public interface HasId {
    Integer getId();

    void setId(Integer id);

    default boolean isInitialised() {
        return getId() != null;
    }
}
