package com.example.demo.leaderboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/leaderboard")
public class LeaderboardEntryController {

    @Autowired
    private LeaderboardEntryService leaderboardEntryService;

    // Display the leaderboard entries
    @GetMapping("/lists")
    public String showLeaderboard(Model model) {
        List<LeaderboardEntry> entries = leaderboardEntryService.getAllLeaderboardEntries();
        model.addAttribute("entries", entries);
        model.addAttribute("newEntry", new LeaderboardEntry());
        return "leaderboard"; // Make sure you have a Thymeleaf template named "leaderboard.html"
    }
    
    @GetMapping("/edit/{id}")
    public String editLeaderboardEntryForm(@PathVariable Long id, Model model) {
        LeaderboardEntry entry = leaderboardEntryService.getLeaderboardEntryById(id);
        model.addAttribute("entry", entry);
        return "edit-leaderboard"; // Create a Thymeleaf template for editing
    }

    // Create a new leaderboard entry
    @PostMapping("/entry")
    public String createLeaderboardEntry(@ModelAttribute LeaderboardEntry newEntry) {
        leaderboardEntryService.createLeaderboardEntry(newEntry);
        return "redirect:/leaderboard/lists"; // Redirect to the correct URL
    }

    // Update an existing leaderboard entry
    @PostMapping("/update/{id}")
    public String updateLeaderboardEntry(@PathVariable Long id, @ModelAttribute LeaderboardEntry updatedEntry) {
        updatedEntry.setLeaderboardEntryID(id);
        leaderboardEntryService.updateLeaderboardEntry(updatedEntry);
        return "redirect:/leaderboard/lists"; // Redirect to the correct URL
    }

    // Delete a leaderboard entry
    @GetMapping("/delete/{id}")
    public String deleteLeaderboardEntry(@PathVariable Long id) {
        leaderboardEntryService.deleteLeaderboardEntry(id);
        return "redirect:/leaderboard/lists"; // Redirect to the correct URL
    }
}


