package com.kimsangheon.board_back.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto {
    
    private String code;
    private String message;

    private static ResponseEntity<ResponseDto> success() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> validationFailed() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.VALIDATION_FAILED, ResponseMessage.VALIDATION_FAILED);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> duplicateEmail() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> duplicateTelNumber() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> duplicateNickname() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> noExistUser() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> noExistBoard() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> noPermission() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(responseBody);
    }

    private static ResponseEntity<ResponseDto> databaseError() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

}
