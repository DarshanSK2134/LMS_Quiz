package com.example.demo.userprogress;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProgressRepository extends JpaRepository<UserProgress, Long> {

	List<UserProgress> findByUserID(Long userID);

}
