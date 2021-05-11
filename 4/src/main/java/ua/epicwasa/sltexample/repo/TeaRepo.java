package ua.epicwasa.sltexample.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import ua.epicwasa.sltexample.entity.Tea;

@Component
public interface TeaRepo extends CrudRepository<Tea, Long> {
}
