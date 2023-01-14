package filipszydlak.springframework.springrecipeapp.repositories;

import filipszydlak.springframework.springrecipeapp.domain.Recipe;
import filipszydlak.springframework.springrecipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
    Optional<Recipe> findByDescription(String description);

}
