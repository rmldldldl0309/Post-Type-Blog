package com.kimsangheon.board_back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "board_list_view")
@Table(name = "boardListView")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardListViewEntity {
    
    @Id
    private Integer boardNumber;
    private String title;
    private String content;
    private String titleImage;
    private Integer viewCount;
    private Integer favoriteCount;
    private Integer commentCount;
    private String writeDatetime;
    private String writerEmail;
    private String writerNickname;
    private String writerProfileImage;

}
