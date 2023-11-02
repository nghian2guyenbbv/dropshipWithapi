package com.renovatebot.demospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/renovate")
public class RenovateControler {

  @GetMapping("/message")
  public String getMessage(){
    return "message";
  }
}
