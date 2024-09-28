package ru.topjava.poller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "ru.topjava.poller.repository")
@EntityScan(basePackages = "ru.topjava.poller.model")
public class MainPoller {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}