package com.example.demo.Quiz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepository;

	public Quiz createQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	public Quiz getQuizById(Long id) {
		return quizRepository.findById(id).orElse(null);
	}

	public List<Quiz> getAllQuizzes() {
		return quizRepository.findAll();
	}

	public Quiz updateQuiz(Quiz updatedQuiz) {
		return quizRepository.save(updatedQuiz);
	}

	public void deleteQuiz(Long id) {
		quizRepository.deleteById(id);
	}
}
