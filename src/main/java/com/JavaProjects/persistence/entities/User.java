package com.JavaProjects.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


//Entity is part of JPA it indicates that the class is an entity and should be mapped to a table in the database
@Entity
@Table(name = "users") //Specifies that we are mapping it to the users table in our db
public class User {

    //Specify properties
    //id, first_name, last_name, username, email, password, profile_picture, created at
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String username;

    private String email;

    private String password;

    @Column(name="profile_picture")
    private String profilePicture;

    @Column(name="created_at")
    private LocalDateTime createdAt;



    //orphanRemoval allows us to remove the recipe if it no longer has a parent User
    @OneToMany(mappedBy="user", cascade= CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Recipe> recipes = new ArrayList<>();



    //GETTERS
    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public List<Recipe> getRecipes(){
        return recipes;
    }

    //SETTERS


    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

}
