package com.apoorv.transaction.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("stock")
@RestController
public class transaction {

    @GetMapping("test")
    public ResponseEntity testService() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
