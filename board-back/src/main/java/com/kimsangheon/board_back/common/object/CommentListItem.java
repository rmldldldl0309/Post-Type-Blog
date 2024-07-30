package com.kimsangheon.board_back.common.object;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@NoArgsConstructor
public class CommentListItem {

    private String nickname;
    private String profileImage;
    private String writeDatetime;
    private String content;
    
}
