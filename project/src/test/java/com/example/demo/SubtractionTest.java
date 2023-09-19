package com.example.demo;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractionTest extends BaseAPITest {

    @Test

    public void testSubtractionEndpoint() {
        // Simulate user login and get the authentication token

        //   String authToken = ApiClient.login("yourUsername", "yourPassword");
        APIClient client = new APIClient("http://localhost:8082");
        ApiController controlApi = new ApiController();
        List<Integer> params = Arrays.asList(21, 2);
        // Perform the addition operation
        Response response = client.post("/subtraction",params);

        // Assertions
        assertEquals(200, response.getStatusCode());
        assertEquals(controlApi.subtraction(params), response.getBody().as(Integer.class));
    }
}
