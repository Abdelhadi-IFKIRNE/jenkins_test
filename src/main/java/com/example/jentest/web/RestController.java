package com.example.jentest.web;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/")
   public String getMessage(){
       return "jenkins start .....";
   }


   @GetMapping("/changes")
   public String getMessageTow(){
        return "changes .....";
   }
}
