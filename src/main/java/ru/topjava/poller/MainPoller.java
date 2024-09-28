package ru.topjava.poller;

import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@AllArgsConstructor
@EnableCaching
public class MainPoller {

    public static void main(String[] args) {
        SpringApplication.run(MainPoller.class, args);
    }

}
