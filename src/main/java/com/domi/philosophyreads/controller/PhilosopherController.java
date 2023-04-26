package com.domi.philosophyreads.controller;

import com.domi.philosophyreads.service.PhilosopherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/philosophers")
public class PhilosopherController {
    private final PhilosopherService philosopherService;

    @Autowired
    public PhilosopherController(PhilosopherService philosopherService) {this.philosopherService = philosopherService;}
}
