package org.example.repos;

import org.example.model.UserOpenAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOpenAnswerRepository extends JpaRepository<UserOpenAnswer, Integer> {
}
