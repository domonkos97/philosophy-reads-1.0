package com.domi.philosophyreads.presistance;

import com.domi.philosophyreads.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
