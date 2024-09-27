package ru.topjava.poller.repository.crud;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.topjava.poller.model.Menu;

public interface CrudMenuRepository extends JpaRepository<Menu, Integer> {

}
