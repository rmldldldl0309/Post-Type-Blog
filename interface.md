> signIn (로그인)

- request

{
    *email : String,
    *password : String
}

- response 

성공 - 200
{
    code : "SU",
    message : "Success"
}

필수 정보 미입력

실패 - 401 (Unauthorized)
{
    code : "SF",
    message : "Sign In Failed."
}

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE",
    message : "Database Error"
}

=======================================
> signUp (회원가입)

- request

{
    *email : String,
    *password : String,
    *nickname : String,
    *telNumber : String,
    *address : String,
    addressDetail : String
}

- response 

성공 - 200
{
    code : "SU",
    message : "Success",
    token : "jwt...",
    expiredDate: 123456789
}

필수 정보 미입력 / 이메일 형태 불일치 / 비밀번호 8자리 미만 전화번호 포멧 불일치

이메일 중복 - 400 (Bad Request)
{
    code : "EE"
    message : "Existed Email"
}

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> weeklyTop3List (주간 상위 3 게시물 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    top3List : boardListItem[]
}

    BoardListItem {
        boardNumber : int,
        title : string,
        content : string,
        boardTitleImage : string,
        favorite : int,
        commentCount : int,
        viewCount : int,
        writeDatetime : string,
        writerNickname : string,
        writerProfileImage : string,
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> currentList (최신 게시물 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    currentList : boardListItem[]
}

    BoardListItem {
        boardNumber : int,
        title : string,
        content : string,
        boardTitleImage : string,
        favorite : int,
        commentCount : int,
        viewCount : int,
        writeDatetime : string,
        writerNickname : string,
        writerProfileImage : string,
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> popularWordList (인기 검색어 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    popularWordList : String[]
}

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> searchList (검색 게시물 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    searchList : boardListItem[]
}

    BoardListItem {
        boardNumber : int,
        title : string,
        content : string,
        boardTitleImage : string,
        favorite : int,
        commentCount : int,
        viewCount : int,
        writeDatetime : string,
        writerNickname : string,
        writerProfileImage : string
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> relativeWordList (관련 검색어 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    relativeWordList : String[]
}

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> boardDetail (게시물 상세)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    boardNumber : int,
    title : string,
    content : string,
    boardImage : string[],
    writeDatetime : string,
    writerEmail : string,
    writerNickname : string,
    writerProfileImage : string,
}

존재하지 않는 게시물 - 400 (Bad Request)
{
    code : "NB"
    message : "No Existed Board."
}

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> favoriteList (좋아요 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    favoriteList : FavoriteListItem[]
}

    FavoriteListItem {
        email : string,
        nickname : string,
        profileImage : string
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> putFavorite (좋아요 기능)

- request

{
    *boardNumber : int
}

- response

성공 - 200
{
    code : "SU",
    message : "Success",
}

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> commentList (댓글 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    commentList : CommentListItem[]
}

    CommentListItem {
        email : string,
        nickname : string,
        writeDatetime : string,
        content : string
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> postComment (댓글 쓰기)

- request

{
    *content : string    
}

- response

성공 - 200
{
    code : "SU",
    message : "Success",
}

존재하지 않는 게시물 - 400 (Bad Request)
{
    code : "NB"
    message : "No Existed Board"
} 

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> boardList (게시물 삭제)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
}

존재하지 않는 게시물 - 400 (Bad Request)
{
    code : "NB"
    message : "No Existed Board"
} 

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

권한 없음 - 403 (Forbidden)
{
    code : "NP"
    message : "No Permission"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> boardWrite (게시물 작성)

- request 
{
    *title : string,
    *content : string,
    boardImageList : string[]
}

- response

성공 - 200
{
    code : "SU",
    message : "Success",
}

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

권한 없음 - 403 (Forbidden)
{
    code : "NP"
    message : "No Permission"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 
=======================================
> boardUpdate (게시물 수정)

- request 
{
    *title : string,
    *content : string,
    boardImageList : string[]
}

- response

성공 - 200
{
    code : "SU",
    message : "Success",
}

존재하지 않는 게시물 - 400 (Bad Request)
{
    code : "NB"
    message : "No Existed Board"
} 

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

권한 없음 - 403 (Forbidden)
{
    code : "NP"
    message : "No Permission"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> getUser (유저 정보)

- response 

성공 - 200
{
    code : "SU",
    message : "Success",
    email : string,
    nickname : string,
    profileImage : string
}

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
} 

=======================================
> userBoardList (특정 유저 게시물 리스트) 

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    boardList : boardListItem[]
}

    BoardListItem 
    {
        boardNumber : int,
        title : string,
        content : string,
        boardTitleImage : string,
        favorite : int,
        commentCount : int,
        viewCount : int,
        writeDatetime : string,
        writerNickname : string,
        writerProfileImage : string,
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================

> searchList (검색 게시물 리스트)

- response

성공 - 200
{
    code : "SU",
    message : "Success",
    searchList : boardListItem[]
}

    BoardListItem 
    {
        boardNumber : int,
        title : string,
        content : string,
        boardTitleImage : string,
        favorite : int,
        commentCount : int,
        viewCount : int,
        writeDatetime : string,
        writerNickname : string,
        writerProfileImage : string,
    }

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> patchNickname (닉네임 수정)

- request 
{
    *nickname : string
}

- resposne

성공 - 200
{
    code : "SU",
    message : "Success",
}

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> patchProfileImage (프로필 이미지 수정)

- request 
{
    *profileImage : string
}

- resposne

성공 - 200
{
    code : "SU",
    message : "Success",
}

존재하지 않는 유저 - 400 (Bad Request)
{
    code : "NU"
    message : "No Existed User"
} 

데이터베이스 에러 - 500 (Internal Server Error)
{
    code : "DE"
    message : "Database Error"
}

=======================================
> fileUpload (파일 업로드)

=======================================
> getFile (파일 불러오기)
