package filipszydlak.springframework.springrecipeapp.repositories;

import filipszydlak.springframework.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
