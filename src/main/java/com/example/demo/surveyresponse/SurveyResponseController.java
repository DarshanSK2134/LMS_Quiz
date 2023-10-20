package com.example.demo.surveyresponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/surveyresponses")
public class SurveyResponseController {

    @Autowired
    private SurveyResponseService surveyResponseService;

    @GetMapping("/")
    public String getAllSurveyResponses(Model model) {
        List<SurveyResponse> responses = surveyResponseService.getAllSurveyResponses();
        model.addAttribute("responses", responses);
        return "surveyresponses";
    }

    @GetMapping("/create")
    public String createSurveyResponseForm(Model model) {
        SurveyResponse newResponse = new SurveyResponse();
        model.addAttribute("newResponse", newResponse);
        return "create_surveyresponse"; // Create a new Thymeleaf template for the creation form
    }

    @PostMapping("/create")
    public String createSurveyResponse(@ModelAttribute("newResponse") SurveyResponse response) {
        surveyResponseService.createSurveyResponse(response);
        return "redirect:/surveyresponses/";
    }

    @GetMapping("/edit/{id}")
    public String editSurveyResponseForm(@PathVariable Long id, Model model) {
        Optional<SurveyResponse> response = surveyResponseService.getSurveyResponseById(id);
        model.addAttribute("response", response.orElse(null));
        return "edit_surveyresponse"; // Create a new Thymeleaf template for the edit form
    }

    @PostMapping("/edit/{id}")
    public String updateSurveyResponse(@PathVariable Long id, @ModelAttribute("response") SurveyResponse updatedResponse) {
        surveyResponseService.updateSurveyResponse(updatedResponse);
        return "redirect:/surveyresponses/";
    }

    @GetMapping("/delete/{id}")
    public String deleteSurveyResponse(@PathVariable Long id) {
        surveyResponseService.deleteSurveyResponse(id);
        return "redirect:/surveyresponses/";
    }
}
