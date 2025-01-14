package com.JavaProjects.api.controller;

import com.JavaProjects.api.dto.RecipeDTO;
import com.JavaProjects.persistence.entities.Recipe;
import com.JavaProjects.persistence.entities.User;
import com.JavaProjects.persistence.repository.UserRepository;
import com.JavaProjects.services.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController //Marks this class as a REST controller
@RequestMapping("/recipes") //Base URL for all methods in this class
public class RecipeController {

    private final RecipeService recipeService;
    //    private final UserRepository userRepository;
    //UserRepository userRepository
    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
//        this.userRepository = userRepository;
    }

    //Handle GET request for all recipes
    @GetMapping
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    //Handle GET request for a single recipe by ID
//    @GetMapping("/{id}")
//    public Recipe getRecipeById(@PathVariable Long id){
//        return recipeService.getRecipeById(id);
//    }
    //Handle POST request to create a new recipe
    @PostMapping
    public RecipeDTO createRecipe(@RequestBody Recipe recipe){

//        User user = userRepository.findById(recipe.getUser().getId())
//                .orElseThrow(() -> new RuntimeException("User not found"));
//
//        recipe.setUser(user);
//        return recipeService.createRecipe(recipe);

        Recipe savedRecipe = recipeService.createRecipe(recipe);
        return new RecipeDTO(
                savedRecipe.getRecipeId(),
                savedRecipe.getTitle(),
                savedRecipe.getDescription(),
                savedRecipe.getCuisineType(),
                savedRecipe.getMealType(),
                savedRecipe.getDietaryRestrictions(),
                savedRecipe.getPhoto(),
                savedRecipe.getUser().getId(),
                savedRecipe.getCreatedAt()

        );
    }

    //Handle POST request to update an existing recipe

    //Handle DELETE request to remove a recipe
    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id){
        recipeService.deleteRecipe(id);
    }

}
