package com.example.android.tourapp;

public class Places {
    private String mplace;
    private int mimage;

    public Places(String vplace,int vimage)
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
