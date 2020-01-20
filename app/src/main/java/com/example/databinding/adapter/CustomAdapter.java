package com.example.databinding.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.databinding.model.NewsViewModel;
import com.example.databinding.databinding.NewsBinding;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomView> {


    List<NewsViewModel> list;
    private LayoutInflater layoutInflater;
    public CustomAdapter(List<NewsViewModel> newsModels){
        this.list = newsModels;
    }
    @NonNull
    @Override
    public CustomView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if(layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }

        NewsBinding newsBinding = NewsBinding.inflate(layoutInflater, parent, false);
        return new CustomView(newsBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomView holder, int position) {

        NewsViewModel newsModel = list.get(position);
        holder.bind(newsModel);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class CustomView extends RecyclerView.ViewHolder {

        private NewsBinding newsBinding;

        public CustomView(NewsBinding newsBinding) {
            super(newsBinding.getRoot());

            this.newsBinding = newsBinding;
        }
        public void bind(NewsViewModel newsViewModel){
            this.newsBinding.setNewsView(newsViewModel);
        }

        public NewsBinding getNewsBinding() {
            return newsBinding;
        }
    }
}
