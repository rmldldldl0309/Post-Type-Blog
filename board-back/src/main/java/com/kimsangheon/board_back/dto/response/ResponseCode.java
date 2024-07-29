package com.kimsangheon.board_back.dto.response;

public interface ResponseCode {
    
    String SUCCESS = "SU";

    String VALIDATION_FAILED = "VF";
    String DUPLICATION_EMAIL = "DF";
    String DUPLICATION_TELNUMBER = "DI";
    String DUPLICATION_NICKNAME = "DN";
    String NO_EXIST_USER = "NU";
    String NO_EXIST_BOARD = "NB";

    String SIGNIN_FAILED = "SF";
    String AUTHORIZATION_FAILED = "AF";
    
    String NO_PERMISSION = "NP";

    String DATABASE_ERROR = "DE";

}
