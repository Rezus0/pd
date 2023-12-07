package org.example.repos;

import org.example.model.UserCloseAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserCloseAnswerRepository extends JpaRepository<UserCloseAnswer, Integer> {
}
