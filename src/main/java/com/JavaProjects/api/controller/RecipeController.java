package com.JavaProjects.api.controller;

import com.JavaProjects.persistence.entities.Recipe;
import com.JavaProjects.services.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController //Marks this class as a REST controller
@RequestMapping("/recipes") //Base URL for all methods in this class
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    //Handle GET request for all recipes
    @GetMapping
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    //Handle GET request for a single recipe by ID
    @GetMapping("/{id}")
    public Recipe getRecipeById(@PathVariable Long id){
        return recipeService.getRecipeById(id);
    }
    //Handle POST request to create a new recipe
    @PostMapping
    public Recipe createRecipe(Recipe recipe){
        return recipeService.createRecipe(recipe);
    }

    //Handle POST request to update an existing recipe

    //Handle DELETE request to remove a recipe
    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id){
        recipeService.deleteRecipe(id);
    }

}
