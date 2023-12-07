package org.example.dto.reqDto;

public class UserCloseAnswerReqDto {
    private int gptAnswerId;
    private String text;
    private int questionId;

    public int getGptAnswerId() {
        return gptAnswerId;
    }

    public void setGptAnswerId(int gptAnswerId) {
        this.gptAnswerId = gptAnswerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}
