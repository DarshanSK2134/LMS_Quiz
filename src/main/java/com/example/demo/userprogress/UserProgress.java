package com.example.demo.userprogress;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserProgress {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long userProgressID;
	    private Long userID;
	    private Long quizID;
	    private boolean completed;
	    private LocalDateTime completionDate;
		
	    public UserProgress() {
			
		}
		public UserProgress(Long userProgressID, Long userID, Long quizID, boolean completed,
				LocalDateTime completionDate) {
			super();
			this.userProgressID = userProgressID;
			this.userID = userID;
			this.quizID = quizID;
			this.completed = completed;
			this.completionDate = completionDate;
		}
		public Long getUserProgressID() {
			return userProgressID;
		}
		public void setUserProgressID(Long userProgressID) {
			this.userProgressID = userProgressID;
		}
		public Long getUserID() {
			return userID;
		}
		public void setUserID(Long userID) {
			this.userID = userID;
		}
		public Long getQuizID() {
			return quizID;
		}
		public void setQuizID(Long quizID) {
			this.quizID = quizID;
		}
		public boolean isCompleted() {
			return completed;
		}
		public void setCompleted(boolean completed) {
			this.completed = completed;
		}
		public LocalDateTime getCompletionDate() {
			return completionDate;
		}
		public void setCompletionDate(LocalDateTime completionDate) {
			this.completionDate = completionDate;
		}
	}


