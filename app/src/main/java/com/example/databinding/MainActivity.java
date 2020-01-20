package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.databinding.model.NewsViewModel;
import com.example.databinding.adapter.CustomAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<NewsViewModel> list;
    CustomAdapter customAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        customAdapter = new CustomAdapter(list);

        recyclerView.setAdapter(customAdapter);
        getData();

    }

    private void getData() {
        NewsViewModel newsModel = new NewsViewModel();
        NewsViewModel newsModel1 = new NewsViewModel();

        newsModel.Title = "Hello World";
        newsModel.Desc = "What a diverse country!";
        list.add(newsModel);

        newsModel1.Title = "Hello Chine";
        newsModel1.Desc = "What a populated country!";
        list.add(newsModel1);
    }

}
