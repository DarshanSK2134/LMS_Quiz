package com.example.demo.surveyquestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/surveyquestions")
public class SurveyQuestionController {

    @Autowired
    private SurveyQuestionService surveyQuestionService;

    @GetMapping("/list")
    public String showSurveyQuestions(Model model) {
        List<SurveyQuestion> surveyQuestions = surveyQuestionService.getAllSurveyQuestions();
        model.addAttribute("surveyQuestions", surveyQuestions); // Make sure you add surveyQuestions to the model
        model.addAttribute("newQuestion", new SurveyQuestion());
        model.addAttribute("question", new SurveyQuestion()); // Add an empty object for the edit form
        return "surveyquestions";
    }
    @GetMapping("/edit/{id}")
    public String editSurveyQuestion(@PathVariable Long id, Model model) {
        SurveyQuestion question = surveyQuestionService.getSurveyQuestionById(id);
        model.addAttribute("newQuestion", question); // Add the newQuestion to the model
        return "surveyquestions"; // Return the view
    }

    @PostMapping("/create")
    public String createSurveyQuestion(@ModelAttribute SurveyQuestion newQuestion) {
        surveyQuestionService.createSurveyQuestion(newQuestion);
        return "redirect:/surveyquestions/list";
    }

    @PostMapping("/update/{id}")
    public String updateSurveyQuestion(@PathVariable Long id, @ModelAttribute SurveyQuestion updatedQuestion) {
        updatedQuestion.setSurveyQuestionID(id);
        surveyQuestionService.updateSurveyQuestion(updatedQuestion);
        return "redirect:/surveyquestions/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteSurveyQuestion(@PathVariable Long id) {
        surveyQuestionService.deleteSurveyQuestion(id);
        return "redirect:/surveyquestions/list";
    }
}
