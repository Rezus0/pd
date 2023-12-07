package org.example.dto.resDto;

public class UserOpenAnswerResDto extends BaseResDto {
    private int gptAnswerId;
    private boolean isCorrect;
    private int questionId;

    public int getGptAnswerId() {
        return gptAnswerId;
    }

    public void setGptAnswerId(int gptAnswerId) {
        this.gptAnswerId = gptAnswerId;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }
}
