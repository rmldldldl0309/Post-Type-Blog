package com.kimsangheon.board_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "favorite")
@Table(name = "favorite")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class favoriteEntity {
    
    @Id
    private String userEmail;

    @Id
    private String boardNumber;

}
