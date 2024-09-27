package ru.topjava.poller.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.topjava.poller.model.Menu;
import ru.topjava.poller.repository.crud.CrudMenuRepository;
import ru.topjava.poller.repository.crud.CrudPlaceRepository;

@Repository
public class MenuRepository extends AbstractRepository<Menu, Integer> {

    private final CrudMenuRepository crudMenuRepository;
    private final CrudPlaceRepository crudPlaceRepository;

    public MenuRepository(CrudMenuRepository crudMenuRepository, CrudPlaceRepository crudPlaceRepository) {
        super(crudMenuRepository);
        this.crudMenuRepository = crudMenuRepository;
        this.crudPlaceRepository = crudPlaceRepository;
    }

    @Transactional
    public Menu save(Menu menu, Integer PlaceId) {
        if (menu.isInitialised() && get(menu.getId(), PlaceId) == null) {
            return null;
        }
        menu.setPlace(crudPlaceRepository.getReferenceById(PlaceId));
        return crudMenuRepository.save(menu);
    }

    public boolean delete(Integer id, Integer PlaceId) {
        return crudMenuRepository.delete(id, PlaceId) != 0;
    }

    public Menu get(Integer id, Integer PlaceId) {
        return crudMenuRepository.findById(id)
                .filter(menu -> menu.getPlace().getId().equals(PlaceId))
                .orElse(null);
    }

    public Menu getWithPlace(Integer id, Integer PlaceId) {
        return crudMenuRepository.getWithPlace(id, PlaceId);
    }
}
