package org.example.service;

import org.example.dto.reqDto.GptAnswerReqDto;
import org.example.dto.reqDto.TestReqDto;
import org.example.dto.resDto.GptAnswerResDto;
import org.example.dto.resDto.TestResDto;

import java.util.List;

public interface TestService {
    List<TestResDto> getAll();
    TestResDto getById(int id);
    TestResDto create(TestReqDto testReqDto);
    TestResDto update(TestReqDto testReqDto);
    void delete(int id);
}
