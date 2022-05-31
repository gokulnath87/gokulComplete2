package com.example.person;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

      @GetMapping("/name/{id}")
    public String getName(@PathVariable("id") String id) throws InterruptedException{
          Thread.sleep(4000);
          if(id.equals("user_1"))
              return "gokul";
          throw new RuntimeException();
      }
}
