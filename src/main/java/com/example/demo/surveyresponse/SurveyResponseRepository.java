package com.example.demo.surveyresponse;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyResponseRepository extends JpaRepository<SurveyResponse, Long> {

	List<SurveyResponse> findBysurveyQuestionID(Long surveyQuestionID);

}
