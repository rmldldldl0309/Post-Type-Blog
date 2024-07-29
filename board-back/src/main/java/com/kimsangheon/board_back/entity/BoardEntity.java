package com.kimsangheon.board_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name="board")
@Table(name="board")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer boardNumber;
    private String title;
    private String content;
    private String writeDatetime;
    private Integer favoriteCount;
    private Integer viewCount;
    private Integer commentCount;
    private String writerEmail;

}
