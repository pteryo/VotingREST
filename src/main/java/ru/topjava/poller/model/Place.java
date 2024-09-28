package ru.topjava.poller.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;


@Table(name = "place")
@Entity
public class Place extends AbstractEntity {
    @Id
    @OneToMany
    @JoinColumn(name = "place_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;

    @NotBlank(message = "Fill place! ")
    @Column(nullable = false, unique = true)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
