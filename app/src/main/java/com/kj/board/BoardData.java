package com.kj.board;

//게시판에 사용되는 데이터관리 클래스
class BoardData {

    //게시판 글제목
    private String title;

    public BoardData(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
