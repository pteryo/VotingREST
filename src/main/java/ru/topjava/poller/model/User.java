package ru.topjava.poller.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")

public class User extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @OneToMany
    @JoinColumn(name = "user_id")
    protected Integer id;

    @NotEmpty(message = "Fill username!")
    @Column(nullable = false, unique = true, name = "username")
    private String username;

    @NotEmpty(message = "Fill password!")
    @Column(name = "password", nullable = false)
    private String password;

    @NotEmpty(message = "Fill role!")
    @Column(name = "role", nullable = false)

    private String role;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role.toUpperCase();
    }
}
