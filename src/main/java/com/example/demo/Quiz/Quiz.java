package com.example.demo.Quiz;

import java.time.Duration;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long quizID;
	private String title;
	private String description;
	private Long creatorID;
	private LocalDateTime scheduledDateTime;
	private Duration timeLimit;
	private String category;
	private String status;

	public Quiz() {

	}

	public Quiz(Long quizID, String title, String description, Long creatorID, LocalDateTime scheduledDateTime,
			Duration timeLimit, String category, String status) {
		super();
		this.quizID = quizID;
		this.title = title;
		this.description = description;
		this.creatorID = creatorID;
		this.scheduledDateTime = scheduledDateTime;
		this.timeLimit = timeLimit;
		this.category = category;
		this.status = status;
	}

	public Long getQuizID() {
		return quizID;
	}

	public void setQuizID(Long quizID) {
		this.quizID = quizID;
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

	public LocalDateTime getScheduledDateTime() {
		return scheduledDateTime;
	}

	public void setScheduledDateTime(LocalDateTime scheduledDateTime) {
		this.scheduledDateTime = scheduledDateTime;
	}

	public Duration getTimeLimit() {
		return timeLimit;
	}

	public void setTimeLimit(Duration timeLimit) {
		this.timeLimit = timeLimit;
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
