package com.benitomiyazato.security.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/demo-controller")
public class DemoController {

    @GetMapping()
    public ResponseEntity<String> sayHello(Principal principal){
        return ResponseEntity.ok(String.format("Hello, world! Your name is: %s", principal.getName()));
    }
}
