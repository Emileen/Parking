package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by emileenmarianayagam on 12/20/16.
 */
public class ParkingLot {

    private int id;
    private int capacity;
    private int rate;
    private ArrayList<Vehicle> vehicle = new ArrayList<>();

    public ParkingLot(int id, int capacity, int rate, ArrayList<Vehicle> vehicle) {
        this.id = id;
        this.capacity = capacity;
        this.rate = rate;
        this.vehicle = vehicle;
    }
    public ParkingLot(){}

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

    public void setRate(int rate) {
        this.rate = rate;
    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }



}