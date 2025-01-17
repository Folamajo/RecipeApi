package com.JavaProjects.persistence.entities;

import com.JavaProjects.api.controller.RecipeController;
import jakarta.persistence.*;

@Entity
@Table (name = "recipeingredients")
public class RecipeIngredient {

    @Id //specifies that this is the primary ket of this entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //tells JPA to use auto increment column in the database
    @Column(name = "recipe_ingredient_id")
    private Long recipeIngredientId;

    @ManyToOne //Many recipe ingredients(child) can refer to one recipe (parent side )
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @Column(name="quantity", nullable = false)
    private int quantity;

    @Column (name="unit", nullable = false)
    private String unit;


    //NO ARGUMENT CONSTRUCTOR
    //This constructor is added because JPA requires a no-argument constructor to create an entity
    //using reflection. Without this JPA cannot instantiate objects of the Recipe class when retrieving data from the database

    public RecipeIngredient(){

    }

    //PARAMETERIZED CONSTRUCTOR
    public RecipeIngredient(Long recipeIngredientId, Recipe recipe, int quantity, String unit) {
        this.recipeIngredientId = recipeIngredientId;
        this.recipe = recipe;
        this.quantity = quantity;
        this.unit = unit;
    }

    //GETTERS
    public Long getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }

    //SETTERS

    public void setRecipeIngredientId(Long recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}


