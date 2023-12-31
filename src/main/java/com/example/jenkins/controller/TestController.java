package com.example.jenkins.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class TestController {

    @ResponseBody
    @GetMapping("test")
    public ResponseEntity<String> testGet(@RequestParam String userName){
        return new ResponseEntity<String>("Get: " + userName, HttpStatus.OK);
    }

    @ResponseBody
    @PostMapping ("test")
    public ResponseEntity<String> testPost(@RequestParam String userName){
        return new ResponseEntity<String>("Post: " + userName, HttpStatus.OK);
    }
}
