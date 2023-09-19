package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Validated
@Service
@RestController
public class MyService {



  @PostMapping("/add")
    public Integer add(@RequestParam (value = "params" ) @Size(min= 1, max = 5 , message = "length must be between 1 and 5") List<Integer> params) {
      Integer sum = params.stream()
              .mapToInt(Integer::intValue)
              .sum();
      return sum;
    }
    @PostMapping("/multiplication")
    public Integer multiplication(@RequestParam (value = "params" ) @Size(min= 1, max = 5 , message = "length must be between 1 and 5") List<Integer> params) {

        int result = params.stream().reduce(1, (a, b) -> a * b);
        return result;
    }
    @PostMapping("/division")
    public Integer division(@RequestParam (value = "params" ) @Size(min= 1, max = 5 , message = "length must be between 1 and 5") List<Integer> params) {

        int firstIndex = params.get(0);

        for (int i = 1; i < params.size(); i++)
            firstIndex = firstIndex / params.get(i);
        return firstIndex;
    }
    @PostMapping("/subtraction")
    public Integer subtraction(@RequestParam (value = "params" ) @Size(min= 1, max = 5 , message = "length must be between 1 and 5") List<Integer> params) {

        int firstIndex = params.get(0);

        for (int i = 1; i < params.size(); i++)
            firstIndex = firstIndex - params.get(i);
        return firstIndex;
    }



    @RequestMapping(value = "/sum", method = GET)
    public Integer calculateSum(@RequestParam (value = "params" )  @Size(min= 1, max = 1 , message = "length must be 1") List<Integer> params)
    {
        int sum = 0;
        int i = params.get(0);
        return i*(i+1)/2;
    }


}
