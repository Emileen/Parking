package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by emileenmarianayagam on 12/20/16.
 */
public class ParkingLot {

    int id;
    int capacity;
    double rate;
    ArrayList<Vehicle> vehicle = new ArrayList<>();

    public ParkingLot(int id, int capacity, double rate) {
        this.id = id;
        this.capacity = capacity;
        this.rate = rate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }


}
