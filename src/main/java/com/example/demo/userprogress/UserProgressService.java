package com.example.demo.userprogress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProgressService {

    @Autowired
    private UserProgressRepository userProgressRepository;

    public UserProgress createUserProgress(UserProgress progress) {
        return userProgressRepository.save(progress);
    }

    public UserProgress getUserProgressById(Long id) {
        return userProgressRepository.findById(id).orElse(null);
    }

    public List<UserProgress> getUserProgressByUserID(Long userID) {
        return userProgressRepository.findByUserID(userID);
    }

    public UserProgress updateUserProgress(UserProgress updatedProgress) {
        return userProgressRepository.save(updatedProgress);
    }

    public void deleteUserProgress(Long id) {
        userProgressRepository.deleteById(id);
    }

    public List<UserProgress> getAllUserProgress() {
        return userProgressRepository.findAll();
    }
}
