package com.example.demo.qparticipation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/quizparticipation")
public class QuizParticipationController {

    @Autowired
    private QuizParticipationService quizParticipationService;

    @GetMapping("/list")
    public String getAllParticipations(Model model) {
        List<QuizParticipation> participations = quizParticipationService.getAllParticipations();
        model.addAttribute("participations", participations);
        model.addAttribute("newParticipation", new QuizParticipation());
        return "quizparticipation";
    }

    @GetMapping("/create")
    public String createParticipationForm(Model model) {
        model.addAttribute("newParticipation", new QuizParticipation());
        return "createParticipation";
    }

    @PostMapping("/create")
    public String createParticipation(@ModelAttribute("newParticipation") QuizParticipation newParticipation) {
        quizParticipationService.createParticipation(newParticipation);
        return "redirect:/quizparticipation/list";
    }

    @GetMapping("/edit/{id}")
    public String editParticipationForm(@PathVariable Long id, Model model) {
        QuizParticipation participation = quizParticipationService.getParticipationById(id);
        model.addAttribute("participation", participation);
        return "editParticipation";
    }

    @PostMapping("/edit/{id}")
    public String editParticipation(@PathVariable Long id, @ModelAttribute("participation") QuizParticipation updatedParticipation) {
        quizParticipationService.updateParticipation(updatedParticipation);
        return "redirect:/quizparticipation/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteParticipation(@PathVariable Long id) {
        quizParticipationService.deleteParticipation(id);
        return "redirect:/quizparticipation/list";
    }
}
