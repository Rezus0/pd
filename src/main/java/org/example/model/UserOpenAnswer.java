package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_close_answer")
public class UserOpenAnswer extends BaseEntity {
    private GptAnswer gptAnswer;
    private boolean isCorrect;
    private Question question;

    @ManyToOne
    @JoinColumn(name = "gpt_answer_id", nullable = false)
    public GptAnswer getGptAnswer() {
        return gptAnswer;
    }

    @Column(name = "is_correct", nullable = false)
    public boolean isCorrect() {
        return isCorrect;
    }

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    public Question getQuestion() {
        return question;
    }
}
