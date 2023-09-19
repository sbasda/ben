package com.example.demo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ApiController {

    @PostMapping("/user/login")
    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
        // Your authentication logic here
        return ResponseEntity.ok("YourAuthTokenHere");
    }

    @PostMapping("/add")
    public int add(@RequestParam List<Integer> params) {
        int result = params.stream().mapToInt(Integer::intValue).sum();
        return result;
    }

    @PostMapping("/subtraction")
    public int subtraction(@RequestParam List<Integer> params) {
        int result = params.get(0) - params.subList(1, params.size()).stream().mapToInt(Integer::intValue).sum();
        return result;
    }

    @PostMapping("/multiplication")
    public int multiplication(@RequestParam List<Integer> params) {
        int result = params.stream().reduce(1, (a, b) -> a * b);
        return result;
    }

    @PostMapping("/division")
    public int divide(@RequestParam List<Integer> params) {
        int result = params.get(0);
        for (int i = 1; i < params.size(); i++) {
            if (params.get(i) != 0) {
                result /= params.get(i);
            }
        }
        return result;
    }

    @GetMapping("/sum")
    public int  sum(@RequestParam int n) {
        int result = (n * (n + 1)) / 2;
        return result;
    }
}