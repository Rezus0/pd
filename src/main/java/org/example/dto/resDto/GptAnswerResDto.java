package org.example.dto.resDto;

import org.example.model.Question;

public class GptAnswerResDto extends BaseResDto {
    private int questionId;
    private String text;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
