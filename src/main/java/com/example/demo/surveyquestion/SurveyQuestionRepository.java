package com.example.demo.surveyquestion;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurveyQuestionRepository extends JpaRepository<SurveyQuestion, Long> {

	SurveyQuestion save(SurveyQuestion question);

	List<SurveyQuestion> findBysurveyID(Long surveyID);




}
