package com.domi.philosophyreads.service;

import com.domi.philosophyreads.entities.Philosopher;
import com.domi.philosophyreads.presistance.PhilosopherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhilosopherService {
    private final PhilosopherRepository philosopherRepository;

    @Autowired
    public PhilosopherService(PhilosopherRepository philosopherRepository) {
        this.philosopherRepository = philosopherRepository;
    }

    public List<Philosopher> getAllPhilosophers(){
        Sort sortByTitleDesc = Sort.by(Sort.Direction.DESC, "name");
        return philosopherRepository.findAll(sortByTitleDesc);
    }

    public Philosopher getPhilosopherById(Long id) {
        return philosopherRepository.getReferenceById(id);
    }
}
