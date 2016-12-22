package com.theironyard.charlotte;


import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import spark.Spark;

import java.util.ArrayList;

public class Main {


    private static ArrayList<ParkingLot> parkingSpot = new ArrayList<>();


    private static JsonParser parser = new JsonParser();
    private static JsonSerializer serializer = new JsonSerializer();

    public static void main(String[] args) {

        ArrayList<Vehicle> vehiclesLot1 = new ArrayList<>();
        ArrayList<Vehicle> vehiclesLot2 = new ArrayList<>();
        ArrayList<Vehicle> vehiclesLot3 = new ArrayList<>();
        ArrayList<Vehicle> vehiclesLot4 = new ArrayList<>();


        String port = System.getenv("PORT");

        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }

        //allowing access to the server
        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });
        //create an arraylist for each lost
        //vehicles.add();


        //create the lot
        parkingSpot.add(new ParkingLot(1, 15, 5, vehiclesLot1));
        parkingSpot.add(new ParkingLot(2, 15, 7, vehiclesLot2));
        parkingSpot.add(new ParkingLot(3, 15, 10, vehiclesLot3));
        parkingSpot.add(new ParkingLot(4, 15, 12, vehiclesLot4));


        //shows the lots that are there populated with info
        Spark.get("/lots", (request, response) -> {
            System.out.println("Here are the available lots");
            return serializer.deep(true).serialize(parkingSpot);

        });


        //add vehilce from the inforamtion recived by the sendger
        Spark.post("/parkCar", (request, response) -> {
            // get the new vehicle information from the sender and creates a vehicle class
            Vehicle newVehicle = parser.parse(request.body(), Vehicle.class);


            //for every lot in the array parkingSpot check
            for (ParkingLot lot : parkingSpot) {
                //the id from the parkinglot needs to match the id from the vehile lote
                if (lot.getId() == newVehicle.getId()) {
                    //get the size of the vehicle and times it by the rate of the parkingspot and if its less than or
                    //equal to their rate && their vehicle size is less than equal to the capacity park
                    // then subtract the size of the vehilce from the capacity
                    if (lot.getRate() * newVehicle.getSize() <= newVehicle.getCost() && newVehicle.getSize() <= lot.getCapacity()) {
                        lot.setCapacity(lot.getCapacity() - newVehicle.getSize());
                        System.out.println("you have a parking spot");

                        // adding a vehilce to the araylist of cars
//                        lot.getVehicle().add(newVehicle);
                        lot.addVehicleToLot(newVehicle);
                        return lot.toString();
                        //return serializer.deep(true).serialize(lot.getVehicle());


                        //lot.getVehicle().add(lot.getId(), newVehicle);
                        //display the vehicle that that is in the car list along with the remaining spots.


                    }

                }
            }

            System.out.println(parkingSpot);
            return "";
        });


    }


}


