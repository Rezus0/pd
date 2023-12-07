package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "gpt_answers")
public class GptAnswer extends BaseEntity {
    private Question question;
    private String text;
    private List<UserCloseAnswer> userCloseAnswers;
    private List<UserOpenAnswer> userOpenAnswers;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    public Question getQuestion() {
        return question;
    }

    @Column(name = "gpt_answer_text", nullable = false)
    public String getText() {
        return text;
    }

    @OneToMany(mappedBy = "gptAnswer", cascade = CascadeType.ALL)
    public List<UserCloseAnswer> getUserCloseAnswers() {
        return userCloseAnswers;
    }

    @OneToMany(mappedBy = "gptAnswer", cascade = CascadeType.ALL)
    public List<UserOpenAnswer> getUserOpenAnswers() {
        return userOpenAnswers;
    }
}
