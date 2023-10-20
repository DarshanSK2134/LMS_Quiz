package com.example.demo.leaderboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaderboardEntryService {

    @Autowired
    private LeaderboardEntryRepository leaderboardEntryRepository;

    public List<LeaderboardEntry> getAllLeaderboardEntries() {
        return leaderboardEntryRepository.findAll();
    }

    public LeaderboardEntry createLeaderboardEntry(LeaderboardEntry entry) {
        return leaderboardEntryRepository.save(entry);
    }

    public LeaderboardEntry getLeaderboardEntryById(Long id) {
        return leaderboardEntryRepository.findById(id).orElse(null);
    }

    public List<LeaderboardEntry> getLeaderboardEntriesByQuizID(Long quizID) {
        return leaderboardEntryRepository.findByQuizID(quizID);
    }

    public LeaderboardEntry updateLeaderboardEntry(LeaderboardEntry updatedEntry) {
        return leaderboardEntryRepository.save(updatedEntry);
    }

    public void deleteLeaderboardEntry(Long id) {
        leaderboardEntryRepository.deleteById(id);
    }
}
