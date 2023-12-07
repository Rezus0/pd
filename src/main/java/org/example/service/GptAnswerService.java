package org.example.service;

import org.example.dto.reqDto.GptAnswerReqDto;
import org.example.dto.resDto.GptAnswerResDto;

import java.util.List;

public interface GptAnswerService {
    List<GptAnswerResDto> getAll();
    GptAnswerResDto getById(int id);
    GptAnswerResDto create(GptAnswerReqDto gptAnswerReqDto);
    GptAnswerResDto update(GptAnswerReqDto gptAnswerReqDto);
    void delete(int id);
}
