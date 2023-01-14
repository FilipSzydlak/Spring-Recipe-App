package filipszydlak.springframework.springrecipeapp.repositories;

import filipszydlak.springframework.springrecipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
