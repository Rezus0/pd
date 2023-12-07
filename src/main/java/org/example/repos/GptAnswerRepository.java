package org.example.repos;

import org.example.model.GptAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GptAnswerRepository extends JpaRepository<GptAnswer, Integer> {
}
