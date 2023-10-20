package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/surveys")
public class SurveyController {

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/list")
    public String showSurveys(Model model) {
        List<Survey> surveys = surveyService.getAllSurveys();
        model.addAttribute("surveys", surveys);
        model.addAttribute("newSurvey", new Survey());
        return "survey";
    }

    @GetMapping("/survey/{id}")
    public String showSurveyForm(@PathVariable Long id, Model model) {
        Survey survey = surveyService.getSurveyById(id);
        model.addAttribute("survey", survey);
        List<Survey> surveys = surveyService.getAllSurveys();
        model.addAttribute("surveys", surveys);
        model.addAttribute("newSurvey", new Survey()); // Add this line
        return "survey";
    }
    @GetMapping("/edit/{id}")
    public String editSurveyForm(@PathVariable Long id, Model model) {
        Survey survey = surveyService.getSurveyById(id);
        model.addAttribute("survey", survey);
        List<Survey> surveys = surveyService.getAllSurveys();
        model.addAttribute("surveys", surveys);
        return "edit_survey"; // Create an "edit_survey" HTML template
    }

    @PostMapping("/create")
    public String createSurvey(@ModelAttribute Survey newSurvey) {
        surveyService.createSurvey(newSurvey);
        return "redirect:/surveys/list";
    }

    @PostMapping("/update/{id}")
    public String updateSurvey(@PathVariable Long id, @ModelAttribute Survey updatedSurvey) {
        updatedSurvey.setSurveyID(id);
        surveyService.updateSurvey(updatedSurvey);
        return "redirect:/surveys/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteSurvey(@PathVariable Long id) {
        surveyService.deleteSurvey(id);
        return "redirect:/surveys/list";
    }
}
