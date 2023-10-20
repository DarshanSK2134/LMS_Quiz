	package com.example.demo.quizquestions;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuizQuestion {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long questionID;
	    private Long quizID;
	    private String questionText;
	    private String type;
	    private List<String> options;
	    private String correctAnswer;
	    private String difficultyLevel;
		
	    
	    public QuizQuestion() {
		
		}
		public QuizQuestion(Long questionID, Long quizID, String questionText, String type, List<String> options,
				String correctAnswer, String difficultyLevel) {
			super();
			this.questionID = questionID;
			this.quizID = quizID;
			this.questionText = questionText;
			this.type = type;
			this.options = options;
			this.correctAnswer = correctAnswer;
			this.difficultyLevel = difficultyLevel;
		}
		public Long getQuestionID() {
			return questionID;
		}
		public void setQuestionID(Long questionID) {
			this.questionID = questionID;
		}
		public Long getQuizID() {
			return quizID;
		}
		public void setQuizID(Long quizID) {
			this.quizID = quizID;
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
		public List<String> getOptions() {
			return options;
		}
		public void setOptions(List<String> options) {
			this.options = options;
		}
		public String getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(String correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		public String getDifficultyLevel() {
			return difficultyLevel;
		}
		public void setDifficultyLevel(String difficultyLevel) {
			this.difficultyLevel = difficultyLevel;
		}
	       
	}



