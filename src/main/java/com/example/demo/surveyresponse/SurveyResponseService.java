package com.example.demo.surveyresponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyResponseService {

    @Autowired
    private SurveyResponseRepository surveyResponseRepository;

    public SurveyResponse createSurveyResponse(SurveyResponse response) {
        return surveyResponseRepository.save(response);
    }

    public List<SurveyResponse> getAllSurveyResponses() {
        return surveyResponseRepository.findAll();
    }

    public Optional<SurveyResponse> getSurveyResponseById(Long id) {
        return surveyResponseRepository.findById(id);
    }

    public SurveyResponse updateSurveyResponse(SurveyResponse updatedResponse) {
        return surveyResponseRepository.save(updatedResponse);
    }

    public void deleteSurveyResponse(Long id) {
        surveyResponseRepository.deleteById(id);
    }
}
