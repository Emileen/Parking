package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by emileenmarianayagam on 12/20/16.
 */
public class ParkingLot {

    ArrayList<Vehicle> vehicle = new ArrayList<>();
    int capacity;
    int id;
    double rate;

    public ParkingLot(int capacity, int id, double rate) {
        this.capacity = capacity;
        this.id = id;
        this.rate = rate;
    }

    /*public ParkingLot(ArrayList<Vehicle> vehicle, int capacity, int id, double rate) {
        this.vehicle = vehicle;
        this.capacity = capacity;
        this.id = id;
        this.rate = rate;

    }

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }*/

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
