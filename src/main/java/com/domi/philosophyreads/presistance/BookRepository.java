package com.domi.philosophyreads.presistance;

import com.domi.philosophyreads.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
