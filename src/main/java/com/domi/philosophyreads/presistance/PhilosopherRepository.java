package com.domi.philosophyreads.presistance;

import com.domi.philosophyreads.entities.Philosopher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhilosopherRepository extends JpaRepository<Philosopher, Long> {
}
