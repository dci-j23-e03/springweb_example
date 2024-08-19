package com.example.springweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping()
public class HelloController {
  private final HelloService helloService;

  public HelloController(@Autowired HelloService helloService) {
      this.helloService = helloService;
  }

  @GetMapping()
  public String hello() {
    return "simpleWelcome";
  }

  @GetMapping("/simpleWelcome")
  public String simpleWelcome() {
    return "simpleWelcome";
  }

  @GetMapping("/hello")
  public String getWelcome(Model model) {
    model.addAttribute("welcomeMsg", "Hello from dynamic Thymeleaf example!");
    return "welcome";
  }

  @GetMapping({"/times", "/times/{numberOfTimes}"})
  public String getHello(
      @RequestParam(value = "type", required = false) String helloType,
      @PathVariable(required = false) Integer numberOfTimes,
      Model model) {
    model.addAttribute("helloMessage", helloService.hello(helloType, numberOfTimes));
    return "hello";
  }

}
