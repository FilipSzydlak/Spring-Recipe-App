package filipszydlak.springframework.springrecipeapp.services;

import filipszydlak.springframework.springrecipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
