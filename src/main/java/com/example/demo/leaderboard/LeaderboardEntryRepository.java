package com.example.demo.leaderboard;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardEntryRepository extends JpaRepository<LeaderboardEntry, Long>{

	List<LeaderboardEntry> findByQuizID(Long quizID);

}
