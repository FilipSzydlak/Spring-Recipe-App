package filipszydlak.springframework.springrecipeapp.repositories;

import filipszydlak.springframework.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
