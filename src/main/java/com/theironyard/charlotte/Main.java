package com.theironyard.charlotte;

import spark.Spark;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String port = System.getenv("PORT");

        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }


        Spark.get("/", (request, response) -> "Hello World!");

        if(port !=null){

        }

        Spark.before(((request, response) -> {response.header("Access-Control-Allow-Origin", "*");}));


    }
}
