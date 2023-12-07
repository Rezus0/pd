package org.example.service;

import org.example.dto.reqDto.UserCloseAnswerReqDto;
import org.example.dto.resDto.UserCloseAnswerResDto;

import java.util.List;

public interface UserCloseAnswerService {
    List<UserCloseAnswerResDto> getAll();
    UserCloseAnswerResDto getById(int id);
    UserCloseAnswerResDto create(UserCloseAnswerReqDto userCloseAnswerReqDto);
    UserCloseAnswerResDto update(UserCloseAnswerReqDto userCloseAnswerReqDto);
    void delete(int id);
}
