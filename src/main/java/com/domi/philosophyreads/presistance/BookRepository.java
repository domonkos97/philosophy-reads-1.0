package com.domi.philosophyreads.presistance;

import com.domi.philosophyreads.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    public List<Book> getBooksByAuthorId(Long id);
}
