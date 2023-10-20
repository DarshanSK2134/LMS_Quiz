package com.example.demo.surveyquestion;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SurveyQuestion {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long surveyQuestionID;
	    private Long surveyID;
	    private String questionText;
	    private String type;
	    
	    
		public SurveyQuestion() {
		
		}
		public SurveyQuestion(Long surveyQuestionID, Long surveyID, String questionText, String type) {
			super();
			this.surveyQuestionID = surveyQuestionID;
			this.surveyID = surveyID;
			this.questionText = questionText;
			this.type = type;
		}
		public Long getSurveyQuestionID() {
			return surveyQuestionID;
		}
		public void setSurveyQuestionID(Long surveyQuestionID) {
			this.surveyQuestionID = surveyQuestionID;
		}
		public Long getSurveyID() {
			return surveyID;
		}
		public void setSurveyID(Long surveyID) {
			this.surveyID = surveyID;
		}
		public String getQuestionText() {
			return questionText;
		}
		public void setQuestionText(String questionText) {
			this.questionText = questionText;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
	}


