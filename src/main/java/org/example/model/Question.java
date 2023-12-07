package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "questions")
public class Question extends BaseEntity {
    private User user;
    private String text;
    private String subjectName;
    private String themeName;
    private String themeDescription;
    private List<Test> tests;
    private List<GptAnswer> gptAnswers;
    private List<UserCloseAnswer> userCloseAnswers;
    private List<UserOpenAnswer> userOpenAnswers;

    @ManyToOne
    @JoinColumn(name = "question_user_id", nullable = false)
    public User getUser() {
        return user;
    }

    @Column(name = "question_text", nullable = false)
    public String getText() {
        return text;
    }

    @Column(name = "question_subject_name", nullable = false)
    public String getSubjectName() {
        return subjectName;
    }

    @Column(name = "question_theme_name", nullable = false)
    public String getThemeName() {
        return themeName;
    }

    @Column(name = "question_theme_description", nullable = false)
    public String getThemeDescription() {
        return themeDescription;
    }

    @ManyToMany(mappedBy = "questions")
    public List<Test> getTests() {
        return tests;
    }

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    public List<GptAnswer> getGptAnswers() {
        return gptAnswers;
    }

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    public List<UserCloseAnswer> getUserCloseAnswers() {
        return userCloseAnswers;
    }

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    public List<UserOpenAnswer> getUserOpenAnswers() {
        return userOpenAnswers;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setThemeName(String themeName) {
        this.themeName = themeName;
    }

    public void setThemeDescription(String themeDescription) {
        this.themeDescription = themeDescription;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }

    public void setGptAnswers(List<GptAnswer> gptAnswers) {
        this.gptAnswers = gptAnswers;
    }

    public void setUserCloseAnswers(List<UserCloseAnswer> userCloseAnswers) {
        this.userCloseAnswers = userCloseAnswers;
    }

    public void setUserOpenAnswers(List<UserOpenAnswer> userOpenAnswers) {
        this.userOpenAnswers = userOpenAnswers;
    }
}
