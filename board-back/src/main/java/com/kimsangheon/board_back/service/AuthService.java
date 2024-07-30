package com.kimsangheon.board_back.service;

import org.springframework.http.ResponseEntity;

import com.kimsangheon.board_back.dto.request.auth.SignUpRequestDto;
import com.kimsangheon.board_back.dto.response.ResponseDto;

public interface AuthService {
    
    ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto);

}
