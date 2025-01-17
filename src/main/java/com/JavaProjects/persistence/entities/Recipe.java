package com.JavaProjects.persistence.entities;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Entity
@Table (name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="recipe_id")
    private Long recipeId;

    //Many recipes can belong to one user
    //user_id column corresponds to a User entity nullable means it has to be
        // associated with a user and cannot be false
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name ="title", nullable=false)
    private String title;

    @Column(name="description")
    private String description;

    @Column (name = "cuisine_type")
    private String cuisineType;

    @Column (name = "meal_type")
    private String mealType;

    @Column (name = "dietary_restrictions")
    private String dietaryRestrictions;

    @Column (name = "photo")
    private String photo;

    @Column (name = "created_at")
    private LocalDateTime createdAt;

//    @PrePersist
//    protected void onCreate(){
//        this.createdAt = LocalDateTime.now();
//    }

    public Recipe() {
    }

    //CONSTRUCTOR
    public Recipe(Long recipeId, User user, String title, String description, String cuisineType, String mealType, String dietaryRestrictions, String photo, LocalDateTime createdAt) {
        this.recipeId = recipeId;
        this.user = user;
        this.title = title;
        this.description = description;
        this.cuisineType = cuisineType;
        this.mealType = mealType;
        this.dietaryRestrictions = dietaryRestrictions;
        this.photo = photo;
        this.createdAt = createdAt;
    }


    //GETTERS
    public Long getRecipeId() {
        return recipeId;
    }

    public User getUser() {
        return user;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    //SETTERS


    public void setRecipeId(Long recipeId) {
        this.recipeId = recipeId;
    }

    public void setUser(User user) {
        this.user = user;
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

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
