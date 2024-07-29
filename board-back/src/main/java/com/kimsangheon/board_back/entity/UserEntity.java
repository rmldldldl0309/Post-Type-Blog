package com.kimsangheon.board_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Table(name = "user")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    private String email;
    private String password;
    private String nickname;
    private String telNumber;
    private String address;
    private String addressDetail;
    private String profileDetail;

}
