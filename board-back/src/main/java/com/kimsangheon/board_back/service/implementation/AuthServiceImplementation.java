package com.kimsangheon.board_back.service.implementation;

import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.kimsangheon.board_back.dto.request.auth.SignUpRequestDto;
import com.kimsangheon.board_back.dto.response.ResponseDto;
import com.kimsangheon.board_back.entity.UserEntity;
import com.kimsangheon.board_back.repository.UserRepository;
import com.kimsangheon.board_back.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplementation implements AuthService{

    private final UserRepository userRepository;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public ResponseEntity<ResponseDto> signUp(SignUpRequestDto dto) {

        try {
            
            String email = dto.getEmail();
            String password = dto.getPassword();
            String nickname = dto.getNickname();
            String telNumber = dto.getTelNumber();

            boolean existedEmail = userRepository.existsByEmail(email);
            if (existedEmail) return ResponseDto.duplicateEmail();

            boolean existedNickname = userRepository.existsByNickname(nickname);
            if (existedNickname) return ResponseDto.duplicateNickname();

            boolean existedTelNumber = userRepository.existsByTelNumber(telNumber);
            if (existedTelNumber) return ResponseDto.duplicateTelNumber();

            String encodedPassword = passwordEncoder.encode(password);
            dto.setPassword(encodedPassword);

            UserEntity userEntity = new UserEntity(dto);
            userRepository.save(userEntity);

        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return ResponseDto.success();

    }
    
}
