package com.bitsfy.recipespringapp.repositories;

import com.bitsfy.recipespringapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
