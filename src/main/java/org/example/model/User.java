package org.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "_user")
public class User extends BaseEntity {
    private String firstName;
    private String lastName;
    private String nickname;
    private String password;
    private List<Question> questions;
    private List<Test> tests;

    @Column(name = "user_firstname", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    @Column(name = "user_lastname", nullable = false)
    public String getLastName() {
        return lastName;
    }

    @Column(name = "user_nickname", unique = true, nullable = false)
    public String getNickname() {
        return nickname;
    }

    @Column(name = "user_password", nullable = false)
    public String getPassword() {
        return password;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public List<Question> getQuestions() {
        return questions;
    }

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    public List<Test> getTests() {
        return tests;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public void setTests(List<Test> tests) {
        this.tests = tests;
    }
}
