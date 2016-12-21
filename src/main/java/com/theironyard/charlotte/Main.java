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


        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });

        //ParkingLot park= new ParkingLot();

        parkingSpot.add(new ParkingLot(1, 15, 5.00));
        parkingSpot.add(new ParkingLot(2, 15, 7.00));
        parkingSpot.add(new ParkingLot(3, 15, 10.00));
        parkingSpot.add(new ParkingLot(4, 15, 12.00));


        // get the id from the front end -- switch
        //check --
        // list the cars in the lot

        Spark.get("/lots", (request, response) -> {
            System.out.println("Here are the avaliable lots");
            return serializer.serialize(parkingSpot);

        });
     /*   //add vehilce from the inforamtion recived by the sendger
        Spark.post("/parkCar", (request, response) -> {
            // get the vehicle information from the send and create a vehicle class
            Vehicle newVehilce = parser.parse(request.body(), Vehicle.class);


            //for every parkinglot in the array parkingSpot check
            for (ParkingLot lot : parkingSpot) {
                if (lot.id == newVehilce.getId()) {
                    //get the size of the vehicle and times it by the rate of the parkingspot and if its less than or
                    //equal to their rate && their vehicle size is less than equal to the capacity park
                    // then subtract the size of the vehilce from the capacity
                    if (lot.getRate() * newVehilce.getSize() <= newVehilce.getCost() && newVehilce.getSize() <= lot.capacity) {
                        System.out.println("you have a parking spot");

                    }

                }
            }


            return "";
        });*/
    }


}


