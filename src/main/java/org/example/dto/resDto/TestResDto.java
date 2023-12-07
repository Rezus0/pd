package org.example.dto.resDto;

import org.example.model.User;

public class TestResDto extends BaseResDto {
    private double score;
    private int userId;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
