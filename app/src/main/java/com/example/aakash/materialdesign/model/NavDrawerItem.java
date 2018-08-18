package com.example.aakash.materialdesign.model;

/**
 * Created by akash on 08-02-2018.
 */

public class NavDrawerItem {

    private boolean showNotifiy;
    private String title;

    public NavDrawerItem(){

    }

    public NavDrawerItem(boolean showNotifiy,String title){
        this.showNotifiy = showNotifiy;
        this.title = title;
    }

    public boolean isShowNotifiy() {
        return showNotifiy;
    }

    public void setShowNotifiy(boolean showNotifiy) {
        this.showNotifiy = showNotifiy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
