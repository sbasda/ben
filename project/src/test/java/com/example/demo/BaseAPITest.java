package com.example.demo;


import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class BaseAPITest {
    protected APIClient apiClient;
    protected SecurityProperties.User user;

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = "http://localhost:8082"; // Update with your Spring Boot server URL
    }

}
