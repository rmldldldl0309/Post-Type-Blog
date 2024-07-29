package com.kimsangheon.board_back.dto.response;

public interface ResponseMessage {
    
    String SUCCESS = "Success";

    String VALIDATION_FAILED = "Validation Failed";
    String DUPLICATION_EMAIL = "Duplicate Email";
    String DUPLICATION_TELNUMBER = "Duplicate Telnumber";
    String DUPLICATION_NICKNAME = "Duplicate Nickname";
    String NO_EXIST_USER = "No Exist User";
    String NO_EXIST_BOARD = "No Exist Board";

    String SIGNIN_FAILED = "Sign In Failed";
    String AUTHORIZATION_FAILED = "Authorization Failed";
    
    String NO_PERMISSION = "No Permission";

    String DATABASE_ERROR = "Database Error";

}
