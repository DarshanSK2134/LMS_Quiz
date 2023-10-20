package com.example.demo.Quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private QuizService quizService;

    @GetMapping("/list")
    public String getAllQuizzes(Model model) {
        List<Quiz> quizzes = quizService.getAllQuizzes();
        model.addAttribute("quizzes", quizzes);
        model.addAttribute("newQuiz", new Quiz()); // Add newQuiz to the model
        return "quizList";
    }
    

    @GetMapping("/create")
    public String createQuizForm(Model model) {
        model.addAttribute("newQuiz", new Quiz());
        return "createQuiz";
    }

    @PostMapping("/create")
    public String createQuiz(@ModelAttribute("newQuiz") Quiz newQuiz) {
        quizService.createQuiz(newQuiz);
        return "redirect:/quizzes/list";
    }

    @GetMapping("/edit/{id}")
    public String editQuizForm(@PathVariable Long id, Model model) {
        Quiz quiz = quizService.getQuizById(id);
        model.addAttribute("quiz", quiz);
        return "editQuiz";
    }

    @PostMapping("/edit/{id}")
    public String editQuiz(@PathVariable Long id, @ModelAttribute("quiz") Quiz updatedQuiz) {
        quizService.updateQuiz(updatedQuiz);
        return "redirect:/quizzes/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteQuiz(@PathVariable Long id) {
        quizService.deleteQuiz(id);
        return "redirect:/quizzes/list";
    }
}


