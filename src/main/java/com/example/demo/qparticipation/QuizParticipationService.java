package com.example.demo.qparticipation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizParticipationService {

    @Autowired
    private QuizParticipationRepository quizParticipationRepository;

    public QuizParticipation createParticipation(QuizParticipation participation) {
        return quizParticipationRepository.save(participation);
    }

    public QuizParticipation getParticipationById(Long id) {
        return quizParticipationRepository.findById(id).orElse(null);
    }

    public List<QuizParticipation> getAllParticipations() {
        return quizParticipationRepository.findAll();
    }

    public List<QuizParticipation> getParticipationsByUserID(Long userID) {
        return quizParticipationRepository.findByUserID(userID);
    }

    public QuizParticipation updateParticipation(QuizParticipation updatedParticipation) {
        return quizParticipationRepository.save(updatedParticipation);
    }

    public void deleteParticipation(Long id) {
        quizParticipationRepository.deleteById(id);
    }
}
