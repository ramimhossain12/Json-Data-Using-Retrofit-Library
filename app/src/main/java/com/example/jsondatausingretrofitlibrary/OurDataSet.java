package com.example.jsondatausingretrofitlibrary;

public class OurDataSet {

    String name;
    String hobby;

    public OurDataSet(String name, String hobby) {
        this.name = name;
        this.hobby = hobby;
    }

    public OurDataSet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
