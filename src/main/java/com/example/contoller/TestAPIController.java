package com.example.contoller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestAPIController {

    @GetMapping("/")
    public ResponseEntity<String> healthAPI(){
      return new ResponseEntity<>("Hi this api is running!", HttpStatusCode.valueOf(200));
  }

}
