export interface BoardListItem {

    boardNumber: number;
    title: string;
    content: string;
    boardTitleImage: string | null;
    favoriteCount: number;
    commentCount: number;
    viewCount: number;
    writeDatetime: string;
    writerNickname: string;
    writerProfileImage: string | null;

}

export interface FavoriteListItem {

    email: string;
    nickname: string;
    profileImage: string;

}

export interface CommentListItem {

    nickname: string;
    profileImage: string;
    writeDatetime: string;
    content: string;

}