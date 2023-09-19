package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;


public class APIClient {
    private String baseUrl;

    public APIClient(String baseUrl) {
        this.baseUrl = baseUrl;
        RestAssured.baseURI = baseUrl;
    }

    public Response post(String endpoint, List<Integer> params) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParam("params", params.toArray())
                .when()
                .post(endpoint);
    }

    public Response get(String endpoint,List<Integer> params) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .queryParam("params", params.toArray())
                .when()
                .get(endpoint);
    }

}
