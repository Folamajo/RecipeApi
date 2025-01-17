package com.JavaProjects.api.dto;

public class RecipeIngredientDTO {

    //Instance Variables
    private Long recipeIngredientId;
    private Long recipeId;
    private int quantity;
    private String unit;

    //Default Constructor
    public RecipeIngredientDTO(){

    }

    //Parametrised constructor
    public RecipeIngredientDTO(Long recipeIngredientId, Long recipeId, int quantity, String unit) {
        this.recipeIngredientId = recipeIngredientId;
        this.recipeId = recipeId;
        this.quantity = quantity;
        this.unit = unit;
    }

    //Getters

    public Long getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public Long getRecipeId() {
        return recipeId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getUnit() {
        return unit;
    }


    //Setters
    public void setRecipeIngredientId(Long recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
