package org.example.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_open_answer")
public class UserCloseAnswer extends BaseEntity {
    private GptAnswer gptAnswer;
    private String text;
    private Question question;

    @ManyToOne
    @JoinColumn(name = "gpt_answer_id", nullable = false)
    public GptAnswer getGptAnswer() {
        return gptAnswer;
    }

    @Column(name = "user_answer_text", nullable = false)
    public String getText() {
        return text;
    }

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    public Question getQuestion() {
        return question;
    }
}
