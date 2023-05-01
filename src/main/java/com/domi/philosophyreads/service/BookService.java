package com.domi.philosophyreads.service;

import com.domi.philosophyreads.entities.Book;
import com.domi.philosophyreads.presistance.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        Sort sortByTitleDesc = Sort.by(Sort.Direction.DESC, "title");
        return bookRepository.findAll(sortByTitleDesc);
    }

    public Book getBookById(Long id) {
        return bookRepository.getReferenceById(id);
    }
}
