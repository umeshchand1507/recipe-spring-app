package com.bitsfy.recipespringapp.services;

import com.bitsfy.recipespringapp.domain.Recipe;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
