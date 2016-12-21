package com.theironyard.charlotte;

import spark.Spark;

/**
 * Created by emileenmarianayagam on 12/21/16.
 */
public class Test {
    public static void main(String[] args) {
        // write your code here

        String port = System.getenv("PORT");

        if (port != null) {
            Spark.port(Integer.valueOf(port));
        }

        Spark.before((request, response) -> {
            response.header("Access-Control-Allow-Origin", "*");
        });

        Spark.get("/", ((request, response) -> "Hello, World!"));
    }
}
