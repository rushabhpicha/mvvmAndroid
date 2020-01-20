package com.example.databinding.model;

public class NewsModel {

    public NewsModel(String desc, String title) {
        this.desc = desc;
        this.title = title;
    }

    public String desc;
    public String title;


    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
