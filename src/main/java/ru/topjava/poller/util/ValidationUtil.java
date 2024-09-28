package ru.topjava.poller.util;
import ru.topjava.poller.model.HasId;
import ru.topjava.poller.util.exception.BadRequestException;
import ru.topjava.poller.util.exception.NotFoundException;

import java.util.List;

public class ValidationUtil {

    //перегрузка дженерика нормально не захотела работать.
    //https://stackoverflow.com/questions/45729119/java-overloading-with-generic-type-parameter
    public static <T> T checkNotFoundWithId(T object, int id) {
        if (object instanceof Boolean) {
            checkNotFoundWithIdBoolean((Boolean) object , id);
        } else {
            checkNotFoundWithId(object != null, id);
        }
        return object;
    }

    public static void checkNotFoundWithIdBoolean(boolean found, int id) {
        checkNotFound(found, "id=" + id);
    }

    public static void checkNotFound(boolean found, String msg) {
        if (!found) {
            throw new NotFoundException("Not found entity with " + msg);
        }
    }
    public static void checkNew(HasId bean) {
        if (bean.isInitialised()) {
            throw new BadRequestException(bean + " must be new (id=null)");
        }
    }
    public static <T> List<T> checkListNotEmpty(List<T> list, int menuId) {
        if (list.isEmpty()) {
            throw new NotFoundException("Menu with id " + menuId + " not found or has no items");
        }
        return list;
    }

}