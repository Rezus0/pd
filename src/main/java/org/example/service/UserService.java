package org.example.service;

import org.example.dto.reqDto.TestReqDto;
import org.example.dto.reqDto.UserReqDto;
import org.example.dto.resDto.TestResDto;
import org.example.dto.resDto.UserResDto;

import java.util.List;

public interface UserService {
    List<UserResDto> getAll();
    UserResDto getById(int id);
    UserResDto create(UserReqDto userReqDto);
    UserResDto update(UserReqDto userReqDto);
    void delete(int id);
}
