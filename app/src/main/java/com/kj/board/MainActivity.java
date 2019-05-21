package com.kj.board;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerAdapter = new RecyclerAdapter();
        recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);


        //test data
        for(int i = 0; i < 500; i++){
            recyclerAdapter.getRecyclerDataList().add(new RecyclerData(new BoardData("제목부분입니다" + i)));
        }
        recyclerAdapter.notifyDataSetChanged();

    }
}
