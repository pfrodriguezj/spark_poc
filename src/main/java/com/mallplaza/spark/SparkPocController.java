package com.mallplaza.spark;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import static spark.Spark.port;
import static spark.Spark.get;


public class SparkPocController {

    private SparkPocService service;

    public SparkPocController(SparkPocService service) {
        this.service = service;
        initializeRoutes();
    }

    private void initializeRoutes() {

        port(8080);

        get("/countries", (request, response) -> {
            response.type("application/json");

            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS, new Gson().toJsonTree(service.getCountries())));
        });

        get("/countries/:id", (request, response) -> {
            response.type("application/json");
            return new Gson().toJson(
                    new StandardResponse(StatusResponse.SUCCESS,
                            new Gson().toJsonTree(service.getCountry(Integer.getInteger(request.params(":id"))))
                    ));
        });

    }
}
