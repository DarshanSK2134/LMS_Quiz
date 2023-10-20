package com.example.demo.quizquestions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/quizquestions")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/list")
    public String getAllQuestions(Model model) {
        List<QuizQuestion> questions = questionService.getAllQuestions();
        model.addAttribute("questions", questions);
        model.addAttribute("newQuestion", new QuizQuestion());
        return "questionList";
    }

    @GetMapping("/create")
    public String createQuestionForm(Model model) {
        model.addAttribute("newQuestion", new QuizQuestion());
        return "createQuestion";
    }

    @PostMapping("/create")
    public String createQuestion(@ModelAttribute("newQuestion") QuizQuestion newQuestion) {
        questionService.createQuestion(newQuestion);
        return "redirect:/quizquestions/list";
    }

    @GetMapping("/edit/{id}")
    public String editQuestionForm(@PathVariable Long id, Model model) {
        QuizQuestion question = questionService.getQuestionById(id);
        model.addAttribute("question", question);
        return "editQuestion";
    }

    @PostMapping("/edit/{id}")
    public String editQuestion(@PathVariable Long id, @ModelAttribute("question") QuizQuestion updatedQuestion) {
        questionService.updateQuestion(updatedQuestion);
        return "redirect:/quizquestions/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return "redirect:/quizquestions/list";
    }
}
