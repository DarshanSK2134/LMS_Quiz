package com.example.demo.surveyresponse;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SurveyResponse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long surveyResponseID;
    private Long userID;
    private Long surveyID;
    private Long surveyQuestionID;
    private String response;
    
    
	public SurveyResponse() {
	
	}
	public SurveyResponse(Long surveyResponseID, Long userID, Long surveyID, Long surveyQuestionID, String response) {
		super();
		this.surveyResponseID = surveyResponseID;
		this.userID = userID;
		this.surveyID = surveyID;
		this.surveyQuestionID = surveyQuestionID;
		this.response = response;
	}
	public Long getSurveyResponseID() {
		return surveyResponseID;
	}
	public void setSurveyResponseID(Long surveyResponseID) {
		this.surveyResponseID = surveyResponseID;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public Long getSurveyID() {
		return surveyID;
	}
	public void setSurveyID(Long surveyID) {
		this.surveyID = surveyID;
	}
	public Long getSurveyQuestionID() {
		return surveyQuestionID;
	}
	public void setSurveyQuestionID(Long surveyQuestionID) {
		this.surveyQuestionID = surveyQuestionID;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}

    
}

