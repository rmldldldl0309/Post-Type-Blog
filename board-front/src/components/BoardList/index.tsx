import React from 'react'
import './style.css';

import { BoardListItem } from 'src/types';
import { useNavigate } from 'react-router';
import defaultProfileImage from  'src/assets/image/default-profile-image.png'

interface Props {
    boardListItem: BoardListItem
}

//                  component                   //
export default function BoardList( {boardListItem} : Props) {

    const {boardNumber, title, content, boardTitleImage} = boardListItem;
    const {favoriteCount, commentCount, viewCount} = boardListItem;
    const {writeDatetime, writerNickname, writerProfileImage} = boardListItem;

    //                  function                    //
    // const navigator = useNavigate();

    //                  event handler                   //
    const onClickHandler = () => {
        // navigator(boardNumber);
    }

    //                  render                  //
    return (
        <div className='board-list-item' onClick={onClickHandler}>
            <div className='board-list-item-main-box'>
                <div className='board-list-item-top'>
                    <div className='board-list-item-profile-box'>
                        <div className='board-list-item-profile-image' style={{backgroundImage: `url(${writerProfileImage ? writerProfileImage : defaultProfileImage})`}}></div>
                    </div>
                    <div className='board-list-item-write-box'>
                        <div className='board-list-item-writer-nickname'>{writerNickname}</div>
                        <div className='board-list-item-write-date'>{writeDatetime}</div>
                    </div>
                </div>
                <div className='board-list-item-middle'>
                    <div className='board-list-item-title'>{title}</div>
                    <div className='board-list-item-content'>{content}</div>
                </div>
                <div className='board-list-item-bottom'>
                    <div className='board-list-item-counts'>{`댓글 ${commentCount} - 좋아요 ${favoriteCount} - 조회수 ${viewCount}`}</div>
                </div>
            </div>
            {boardTitleImage !== null &&
            <div className='board-list-item-image-box'>
                <div className='board-list-item-image' style={{backgroundImage: `url(${boardTitleImage})`}}></div>
            </div>
            }
        </div>
    )
}
