package com.domi.philosophyreads.service;

import com.domi.philosophyreads.presistance.PhilospoherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhilosopherService {
    private final PhilospoherRepository philosopherRepository;

    @Autowired
    public PhilosopherService(PhilospoherRepository philosopherRepository) {
        this.philosopherRepository = philosopherRepository;
    }
}
