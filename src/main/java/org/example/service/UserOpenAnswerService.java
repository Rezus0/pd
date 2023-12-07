package org.example.service;

import org.example.dto.reqDto.UserOpenAnswerReqDto;
import org.example.dto.resDto.UserOpenAnswerResDto;

import java.util.List;

public interface UserOpenAnswerService {
    List<UserOpenAnswerResDto> getAll();
    UserOpenAnswerResDto getById(int id);
    UserOpenAnswerResDto create(UserOpenAnswerReqDto userOpenAnswerReqDto);
    UserOpenAnswerResDto update(UserOpenAnswerReqDto userOpenAnswerReqDto);
    void delete(int id);
}
