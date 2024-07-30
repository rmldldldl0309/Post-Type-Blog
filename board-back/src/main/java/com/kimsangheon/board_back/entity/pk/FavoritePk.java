package com.kimsangheon.board_back.entity.pk;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FavoritePk implements Serializable{
    
    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "board_number")
    private Integer boardNumber;

}
