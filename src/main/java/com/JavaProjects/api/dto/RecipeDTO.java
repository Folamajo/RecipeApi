package com.JavaProjects.api.dto;

import java.time.LocalDateTime;

public class RecipeDTO {
    private Long recipeId;
    private String title;
    private String description;
    private String cuisineType;
    private String mealType;
    private String dietaryRestrictions;
    private String photo;
    private Long userId;
    private LocalDateTime createdAt;



    public RecipeDTO(Long recipeId, String title, String description, String cuisineType,
                     String mealType, String dietaryRestrictions, String photo, Long userId, LocalDateTime createdAt) {
        this.recipeId = recipeId;
        this.title = title;
        this.description = description;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
        this.dietaryRestrictions = dietaryRestrictions;
        this.photo = photo;
        this.userId = userId;
        this.createdAt = createdAt;
    }

    //GETTERS
    public Long getRecipeId() {
        return recipeId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getCuisineType() {
        return cuisineType;
    }

    public String getMealType() {
        return mealType;
    }

    public String getDietaryRestrictions() {
        return dietaryRestrictions;
    }

    public String getPhoto() {
        return photo;
    }

    public Long getUserId() {
        return userId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    //SETTERS
    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public void setDietaryRestrictions(String dietaryRestrictions) {
        this.dietaryRestrictions = dietaryRestrictions;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

