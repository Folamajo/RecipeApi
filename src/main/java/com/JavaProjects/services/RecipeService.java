package com.JavaProjects.services;

import com.JavaProjects.api.dto.RecipeDTO;
import com.JavaProjects.persistence.entities.Recipe;
import com.JavaProjects.persistence.repository.RecipeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecipeService {


    private final RecipeRepository recipeRepository;

    //Constructor for dependency injection
    @Autowired
    public RecipeService (RecipeRepository recipeRepository){
        this.recipeRepository = recipeRepository;
    }

    public RecipeDTO getRecipeById(Long id){
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Recipe not found"));


        return new RecipeDTO(
                recipe.getRecipeId(),
                recipe.getTitle(),
                recipe.getDescription(),
                recipe.getCuisineType(),
                recipe.getCuisineType(),
                recipe.getMealType(),
                recipe.getDietaryRestrictions(),
                recipe.getUser().getId(),
                recipe.getCreatedAt()
        );
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
