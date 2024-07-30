import React from 'react';
import './App.css';
import BoardList from './components/BoardList';
import latestBoardListMock from './mocks';

function App() {
  return (
    <>
      {latestBoardListMock.map(
        boardListItem => <BoardList boardListItem={boardListItem}/>)
      }
    </>
  );
}

export default App;
