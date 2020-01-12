package com.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.helper.HttpRequest;

@RestController
@RequestMapping(path = "/api/v0")
public class QuotesController {
   @ResponseBody
   @RequestMapping(path = "/quotes")
    public String helloGradle(){
      return  new HttpRequest().getcall("http://34.69.21.68/query/hello");

    }
}
