package com.JavaProjects.services;

import com.JavaProjects.persistence.entities.Recipe;
import com.JavaProjects.persistence.repository.RecipeRepository;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecipeService {


    private final RecipeRepository recipeRepository;

    //Constructor for dependency injection
    public RecipeService (RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public Recipe getRecipeById(Long id){
        return recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));
    }


    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }



    public Recipe createRecipe(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public void deleteRecipe(Long id){
        recipeRepository.deleteById(id);
    }
}
