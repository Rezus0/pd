package org.example.service;

import org.example.dto.reqDto.GptAnswerReqDto;
import org.example.dto.reqDto.QuestionReqDto;
import org.example.dto.resDto.GptAnswerResDto;
import org.example.dto.resDto.QuestionResDto;

import java.util.List;

public interface QuestionService {
    List<QuestionResDto> getAll();
    QuestionResDto getById(int id);
    QuestionResDto create(QuestionReqDto questionReqDto);
    QuestionResDto update(QuestionReqDto questionReqDto);
    void delete(int id);
}
