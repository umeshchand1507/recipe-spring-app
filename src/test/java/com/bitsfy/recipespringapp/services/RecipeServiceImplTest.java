package com.bitsfy.recipespringapp.services;

import com.bitsfy.recipespringapp.domain.Recipe;
import com.bitsfy.recipespringapp.repositories.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        Recipe recipe = new Recipe();
        recipe.setDescription("Test");
        Set<Recipe> recipes = new HashSet<>();
        recipes.add(recipe);

        recipeService = new RecipeServiceImpl(recipeRepository);
        when(recipeService.getRecipes()).thenReturn(recipes);
    }

    @Test
    public void getRecipes() {
        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals(1, recipes.size());
        for (Recipe recipe: recipes) {
            assertEquals("Test", recipe.getDescription());
            break;
        }
        verify(recipeRepository, times(1)).findAll();
    }
}