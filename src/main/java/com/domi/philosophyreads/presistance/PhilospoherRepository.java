package com.domi.philosophyreads.presistance;

import com.domi.philosophyreads.entities.Philospoher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhilospoherRepository extends JpaRepository<Philospoher, Long> {
}
