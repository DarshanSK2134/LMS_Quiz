package com.example.demo.qparticipation;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuizParticipationRepository extends JpaRepository<QuizParticipation, Long> {

	List<QuizParticipation> findByUserID(Long userID);



}
