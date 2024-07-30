package com.kimsangheon.board_back.dto.request.auth;

import com.kimsangheon.board_back.common.util.EmailRegexpUtil;
import com.kimsangheon.board_back.common.util.PasswordRegexpUtil;
import com.kimsangheon.board_back.common.util.TelNumberRegexpUtil;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class SignUpRequestDto {

    final String emailRegexp = EmailRegexpUtil.regexp;
    final String passwordRegexp = PasswordRegexpUtil.regexp;
    final String telNumberRegexp = TelNumberRegexpUtil.regexp;
    
    @NotBlank
    @Pattern(regexp = emailRegexp)
    private String email;

    @NotBlank
    @Pattern(regexp = passwordRegexp)
    private String password;

    @NotBlank
    private String nickname;

    @NotBlank
    @Pattern(regexp = telNumberRegexp)
    private String telNumber;

    @NotBlank
    private String address;

    private String addressDetail;

    @NotNull
    private Boolean agreedPersonal;

}
