package com.example.databinding.model;

import com.example.databinding.model.NewsModel;

public class NewsViewModel {

    public String Desc, Title;
    public NewsViewModel(NewsModel newsModel) {
        this.Title = newsModel.title;
        this.Desc = newsModel.desc;
    }

    public NewsViewModel(){

    }

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDesc() {
//        return desc;
//    }
//
//    public void setDesc(String desc) {
//        this.desc = desc;
//    }

}
