package com.example.deploy;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MainController {
  @GetMapping("/")
  public String index() {
      return "index";
  }
  @GetMapping("/about")
  public String about() {
      return "about";
  }
}
