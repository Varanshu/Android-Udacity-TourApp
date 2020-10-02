package com.example.android.tourapp;

public class famousStreets {
    private String mplace;
    private int mimage;

    public famousStreets(String vplace,int vimage)
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
