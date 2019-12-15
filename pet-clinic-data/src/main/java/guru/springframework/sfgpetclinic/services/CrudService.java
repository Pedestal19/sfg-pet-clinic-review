package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: sfg-pet-clinic.
 * Date: 11/15/2019.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
