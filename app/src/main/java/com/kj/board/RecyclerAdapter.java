package com.kj.board;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //아이템 뷰에 뿌려질 데이터 리스트
    private ArrayList<RecyclerData> recyclerDataList = new ArrayList<>();

    //외부에서 데이터를 얻기위해 사용하는 함수
    public ArrayList<RecyclerData> getRecyclerDataList() {
        return recyclerDataList;
    }

    //아이템 뷰를 저장하기 위한 뷰홀더객체 생성
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_item, viewGroup, false));
    }

    //position에 해당하는 데이터를 뷰홀더안에있는 아이템뷰에 바인딩
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((ViewHolder)viewHolder).title.setText(recyclerDataList.get(position).getBoardData().getTitle());
    }

    //아이템 사이즈 반환
    @Override
    public int getItemCount() {
        return recyclerDataList.size();
    }


    //아이템 뷰를 저장하기 위한 뷰홀더 클래스 정의
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView title;

        ViewHolder(@NonNull View itemView){
            super(itemView);

            title = itemView.findViewById(R.id.title);

        }
    }
}
