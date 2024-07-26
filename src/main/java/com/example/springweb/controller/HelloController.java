package com.example.springweb.controller;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

//  @GetMapping("/hello")
////  @RequestMapping(value = "/hello", method = RequestMethod.GET)
//  public String printHello() {
//    return "Hello Spring MVC Framework";
//  }
//
//  @GetMapping({"/", "/world"})
////  @RequestMapping(path = {"/", "/world"}, method = RequestMethod.GET)
//  public String printHelloWorld() {
//    return "Hello World";
//  }

  @GetMapping({"/times", "/times/{numberOfTimes}"})
  public String getHello(
      @RequestParam(value = "type", required = false) String helloType,
      @PathVariable(required = false) Integer numberOfTimes) {

    StringBuilder stringBuilder = new StringBuilder();
    if (numberOfTimes == null) {
      numberOfTimes = 1;
    }

    for (int i = 0; i < numberOfTimes; i++) {
      if ("world".equalsIgnoreCase(helloType)) {
        stringBuilder.append("Hello World ");
      } else if ("spring".equalsIgnoreCase(helloType)) {
        stringBuilder.append("Hello Spring MVC Framework ");
      }
    }
    return stringBuilder.toString();
  }

}
