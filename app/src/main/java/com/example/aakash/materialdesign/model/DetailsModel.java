package com.example.aakash.materialdesign.model;

public class DetailsModel {

    private String title;
    private String date;
    private String time;
    private String classId;
    private String location;
    private String registerUrl;

    public DetailsModel(String title, String date, String time, String classId, String location, String registerUrl) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.classId = classId;
        this.location = location;
        this.registerUrl = registerUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRegisterUrl() {
        return registerUrl;
    }

    public void setRegisterUrl(String registerUrl) {
        this.registerUrl = registerUrl;
    }
}
