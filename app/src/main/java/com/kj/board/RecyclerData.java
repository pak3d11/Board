package com.kj.board;

//Recycler View에 사용되는 데이터 관리 클래스
public class RecyclerData {

    private BoardData boardData;

    public RecyclerData(BoardData boardData){
        this.boardData = boardData;
    }

    public BoardData getBoardData(){
        return boardData;
    }

    public void setBoardData(BoardData boardData){
        this.boardData = boardData;
    }
}
