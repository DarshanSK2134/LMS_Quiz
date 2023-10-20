package com.example.demo.quizquestions;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
@Autowired
    private QuestionRepository questionRepository;

    public QuizQuestion createQuestion(QuizQuestion question) {
        // Add any business logic or validation here
        return questionRepository.save(question);
    }

    public QuizQuestion getQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }

    public List<QuizQuestion> getAllQuestions() {
        return questionRepository.findAll();
    }

    public QuizQuestion updateQuestion(QuizQuestion updatedQuestion) {
        // Add any business logic or validation here
        return questionRepository.save(updatedQuestion);
    }

    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}
