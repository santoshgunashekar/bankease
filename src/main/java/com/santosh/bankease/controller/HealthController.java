package com.santosh.bankease.controller;

import org.springframework.web.bind.annotation.RestController;

import com.santosh.bankease.model.HealthResponse;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthController {

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP");
    }
}
