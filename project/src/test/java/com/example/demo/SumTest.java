package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import com.example.demo.APIClient;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.AuthProvider;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest extends BaseAPITest {

    @Test

    public void testAdditionEndpoint() {
        // Simulate user login and get the authentication token

        //   String authToken = ApiClient.login("yourUsername", "yourPassword");
        List<Integer> params = new LinkedList<Integer>();
        params.add(5);

        ApiController controlApi = new ApiController();
        // Perform the addition operation
        Response response = apiClient.get("/sum", params);

        // Assertions
        assertEquals(200, response.getStatusCode());
        assertEquals(controlApi.sum(5), response.getBody().as(Integer.class));
    }
}
