package com.example.demo.surveyquestion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SurveyQuestionService {

    @Autowired
    private SurveyQuestionRepository surveyQuestionRepository;

    public List<SurveyQuestion> getAllSurveyQuestions() {
        return surveyQuestionRepository.findAll();
    }

    public SurveyQuestion createSurveyQuestion(SurveyQuestion question) {
        return surveyQuestionRepository.save(question);
    }

    public SurveyQuestion getSurveyQuestionById(Long id) {
        return surveyQuestionRepository.findById(id).orElse(null);
    }

    public SurveyQuestion updateSurveyQuestion(SurveyQuestion updatedQuestion) {
        return surveyQuestionRepository.save(updatedQuestion);
    }

    public void deleteSurveyQuestion(Long id) {
        surveyQuestionRepository.deleteById(id);
    }
}
