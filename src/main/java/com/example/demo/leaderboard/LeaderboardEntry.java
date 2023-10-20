package com.example.demo.leaderboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class LeaderboardEntry {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long leaderboardEntryID;
	private Long userID;
	private Long quizID;
	private int score;

	public LeaderboardEntry() {

	}

	public LeaderboardEntry(Long leaderboardEntryID, Long userID, Long quizID, int score) {
		super();
		this.leaderboardEntryID = leaderboardEntryID;
		this.userID = userID;
		this.quizID = quizID;
		this.score = score;
	}

	public Long getLeaderboardEntryID() {
		return leaderboardEntryID;
	}

	public void setLeaderboardEntryID(Long leaderboardEntryID) {
		this.leaderboardEntryID = leaderboardEntryID;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



}
