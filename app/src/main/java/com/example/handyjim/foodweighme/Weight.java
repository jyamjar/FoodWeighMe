package com.example.handyjim.foodweighme;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by HandyJim on 2/1/2015.
 */
public class Weight implements Serializable{
    private int mWeightPound;
    private int mWeightCal;
    public ArrayList<Integer> pounds;
    public ArrayList<Integer> calories;

    // User passes in weight in pounds, class then calculates weight in calories



    public int getWeightPound() {
        return mWeightPound;
    }

    public void setWeightPound(int weightPound) {
        mWeightPound = weightPound;
    }

    public int getWeightCal() {
        return mWeightCal;
    }

    public void setWeightCal(int weightCal) {
        mWeightCal = weightCal * 3600;
    }
}
