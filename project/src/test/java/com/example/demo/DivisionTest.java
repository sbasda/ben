package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import com.example.demo.APIClient;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.AuthProvider;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest extends BaseAPITest {

    @Test

    public void testAdditionEndpoint() {
        // Simulate user login and get the authentication token

        //   String authToken = ApiClient.login("yourUsername", "yourPassword");
        ApiController controlApi = new ApiController();
        List<Integer> params = Arrays.asList(4, 2);

        // Perform the addition operation
        Response response = apiClient.post("/divide", params);

        // Assertions
        assertEquals(200, response.getStatusCode());
        assertEquals(controlApi.divide(params), response.getBody().as(Integer.class));
    }
}
