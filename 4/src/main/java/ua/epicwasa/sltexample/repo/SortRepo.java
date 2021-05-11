package ua.epicwasa.sltexample.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ua.epicwasa.sltexample.entity.Sort;

@Component
public interface SortRepo extends CrudRepository<Sort, Long> {
}
