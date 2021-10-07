package com.dynalogies.dynamo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1.0/test")
public class TestController {

    @GetMapping("/")
    public ResponseEntity get() {
        return ResponseEntity.ok("here you go.");
    }
}
