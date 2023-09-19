package com.example.demo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import com.example.demo.APIClient;
import com.example.demo.ApiController;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.AuthProvider;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdditionAPITest extends BaseAPITest {

    @Test

    public void testAdditionEndpoint() {
        // Simulate user login and get the authentication token

     //   String authToken = ApiClient.login("yourUsername", "yourPassword");
        APIClient client = new APIClient("http://localhost:8082");
        ApiController controlApi = new ApiController();
        List<Integer> params = Arrays.asList(1, 2);
        // Perform the addition operation
        Response response = client.post("/add",params);

        // Assertions
        assertEquals(200, response.getStatusCode());
        assertEquals( controlApi.add(params),response.getBody().as(Integer.class));
    }
}
