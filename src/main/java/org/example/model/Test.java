package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "test")
public class Test extends BaseEntity {
    private double score;
    private User user;
    private List<Question> questions;

    public double getScore() {
        return score;
    }

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    public User getUser() {
        return user;
    }

    @ManyToMany
    @JoinTable(name = "test_question",
            joinColumns = @JoinColumn(name = "test_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "question_id", nullable = false))
    public List<Question> getQuestions() {
        return questions;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
