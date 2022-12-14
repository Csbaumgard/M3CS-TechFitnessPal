package com.techelevator.model;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

public class Profile {


    private int userId;
    @NotEmpty
    private int goalCalories;
    @NotEmpty
    private int currentWeight;
    @NotEmpty
    private int desiredWeight;
    @NotEmpty
    private int age;
    private int height;

    private String displayName;
    private Date dateOfBirth;
    private String imgUrl;

    public Profile() {
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getGoalCalories() {
        return goalCalories;
    }

    public void setGoalCalories(int goalCalories) {
        this.goalCalories = goalCalories;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public int getDesiredWeight() {
        return desiredWeight;
    }

    public void setDesiredWeight(int desiredWeight) {
        this.desiredWeight = desiredWeight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
