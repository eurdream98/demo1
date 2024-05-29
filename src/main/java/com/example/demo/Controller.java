package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/test2")
    public ResponseEntity<String> test(){

        return ResponseEntity.ok("안녕하세요.");

    }

    @GetMapping("/test3")
    public ResponseEntity<String> test3(){

        return ResponseEntity.ok("Hello Github Actions!");
    }
}
