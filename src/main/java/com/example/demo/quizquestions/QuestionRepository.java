package com.example.demo.quizquestions;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestionRepository extends JpaRepository<QuizQuestion,Long> {

}
