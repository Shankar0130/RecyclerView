package com.shankaryadav.www.recyclerview;

import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        recyclerView = findViewById (R.id.rv);

        adapter = new MyaAdapter (this,R.drawable.pic);

        recyclerView.setLayoutManager (new GridLayoutManager (this,1));
        recyclerView.setAdapter (adapter);


    }
}

