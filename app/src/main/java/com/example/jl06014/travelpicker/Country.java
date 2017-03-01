package com.example.jl06014.travelpicker;

/**
 * Created by jl06014 on 2/28/2017.
 */

public class Country {

    String name;
    String description;
    int flag;

    public Country() {

    }

    public Country(String countryName, int flagPic) {
        name = countryName;
        flag = flagPic;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

}
