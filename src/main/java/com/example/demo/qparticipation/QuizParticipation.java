package com.example.demo.qparticipation;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class QuizParticipation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long participationID;
	private Long userID;
	private Long quizID;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private int score;

	public QuizParticipation() {

	}

	public QuizParticipation(Long participationID, Long userID, Long quizID, LocalDateTime startTime,
			LocalDateTime endTime, int score) {
		super();
		this.participationID = participationID;
		this.userID = userID;
		this.quizID = quizID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.score = score;
	}

	public Long getParticipationID() {
		return participationID;
	}

	public void setParticipationID(Long participationID) {
		this.participationID = participationID;
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

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
