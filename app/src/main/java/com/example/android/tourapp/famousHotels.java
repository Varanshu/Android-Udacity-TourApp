package com.example.android.tourapp;

public class famousHotels {
    private String mplace;
    private int mimage;

    public famousHotels(String vplace,int vimage)
    {
        mplace=vplace;
        mimage=vimage;
    }

    public String getMplace() {
        return mplace;
    }
    public int getMimage() {
        return mimage;
    }
}
