package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.DB;

@RestController
public class BankController {
  @RequestMapping(value="/bank")
  public Class<DB> display() {
	  return DB.class;
  }
}
