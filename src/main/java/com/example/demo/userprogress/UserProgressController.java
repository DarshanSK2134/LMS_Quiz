package com.example.demo.userprogress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/userprogress")
public class UserProgressController {

    @Autowired
    private UserProgressService userProgressService;

    @GetMapping("/list")
    public String getAllUserProgress(Model model) {
        List<UserProgress> userProgressList = userProgressService.getAllUserProgress();
        model.addAttribute("userProgressList", userProgressList);
        return "userProgressList";
    }

    @GetMapping("/view/{id}")
    public String getUserProgress(@PathVariable Long id, Model model) {
        UserProgress userProgress = userProgressService.getUserProgressById(id);
        model.addAttribute("userProgress", userProgress);
        return "userProgressDetails";
    }

    @GetMapping("/create")
    public String createUserProgressForm(Model model) {
        model.addAttribute("newUserProgress", new UserProgress());
        return "createUserProgress";
    }

    @PostMapping("/create")
    public String createUserProgress(@ModelAttribute("newUserProgress") UserProgress newUserProgress) {
        userProgressService.createUserProgress(newUserProgress);
        return "redirect:/userprogress/list";
    }

    @GetMapping("/userprogress/edit/{id}")
    public String editUserProgress(@PathVariable Long id, Model model) {
        // Fetch the UserProgress object with the given ID from your service
        UserProgress userProgress = userProgressService.getUserProgressById(id);
        
        // Add the UserProgress object to the model
        model.addAttribute("userProgress", userProgress);
        
        return "editUserProgress";
    }


    @PostMapping("/edit/{id}")
    public String editUserProgress(@PathVariable Long id, @ModelAttribute("userProgress") UserProgress updatedUserProgress) {
        userProgressService.updateUserProgress(updatedUserProgress);
        return "redirect:/userprogress/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteUserProgress(@PathVariable Long id) {
        userProgressService.deleteUserProgress(id);
        return "redirect:/userprogress/list";
    }
}
