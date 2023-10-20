package com.example.demo.survey;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Survey {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surveyID;

    private String title;
    private String description;
    private Long creatorID; // Assuming this is a foreign key to a User entity
    private String category;
    private String status; // e.g., Draft, Published

    public Survey() {
        // Default constructor
    }

    // Constructor with fields
    public Survey(String title, String description, Long creatorID, String category, String status) {
        this.title = title;
        this.description = description;
        this.creatorID = creatorID;
        this.category = category;
        this.status = status;
    }

    // Getters and setters

    public Long getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Long surveyID) {
        this.surveyID = surveyID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreatorID() {
        return creatorID;
    }

    public void setCreatorID(Long creatorID) {
        this.creatorID = creatorID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
