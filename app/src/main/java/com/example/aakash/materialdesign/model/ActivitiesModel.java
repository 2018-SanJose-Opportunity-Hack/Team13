package com.example.aakash.materialdesign.model;

import android.widget.ImageView;

public class ActivitiesModel {

    int imageId;
    String text;

    public ActivitiesModel(int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}


