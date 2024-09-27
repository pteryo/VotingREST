package ru.topjava.poller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "users")

public class User extends AbstractEntity {

    @NotEmpty(message = "Fill username!")
    @Column(nullable = false, unique = true)
    private String username;

    @NotEmpty(message = "Fill password!")
    @Column(nullable = false)
    private String password;

    @NotEmpty(message = "Fill role!")
    @Column(nullable = false)
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
        this.role = role;
    }
}
