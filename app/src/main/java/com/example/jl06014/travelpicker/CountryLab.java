package com.example.jl06014.travelpicker;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jl06014 on 2/28/2017.
 */

public class CountryLab {
    private static CountryLab countryLab;
    private List countries;

    public static CountryLab get(Context context) {
        if (countryLab == null) {
            countryLab = new CountryLab(context);
        }
        return countryLab;
    }

    private CountryLab(Context context){
        countries = new ArrayList<>();
        for (int i = 0; i < 100;i++) {
            Country country = new Country();
            country.setName("Crime " + i);
            countries.add(country);
        }
    }
}
