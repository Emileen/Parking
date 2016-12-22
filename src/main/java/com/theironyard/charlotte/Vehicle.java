package com.theironyard.charlotte;

/**
 * Created by emileenmarianayagam on 12/20/16.
 */
public class Vehicle {

    private String make;
    private String model;
    private int size;
    private int cost;
    private int lotId;


    public Vehicle(String make, String model, int size, int cost, int lotId) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.cost = cost;
        this.lotId = lotId;
    }

    public Vehicle() {
    }

    public int getId() {
        return lotId;
    }

    public void setId(int id) {
        this.lotId = id;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", cost=" + cost +
                ", id=" + lotId +
                '}';
    }


}
