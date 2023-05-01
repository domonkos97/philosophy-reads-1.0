package com.domi.philosophyreads.controller;

import com.domi.philosophyreads.entities.Philosopher;
import com.domi.philosophyreads.service.PhilosopherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/philosophers")
public class PhilosopherController {
    private final PhilosopherService philosopherService;

    @Autowired
    public PhilosopherController(PhilosopherService philosopherService) {this.philosopherService = philosopherService;}

    @GetMapping
    public List<Philosopher> getAllPhilosopher() {
        return philosopherService.getAllPhilosophers();
    }
}
