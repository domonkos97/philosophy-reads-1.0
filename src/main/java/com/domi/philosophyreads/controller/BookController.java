package com.domi.philosophyreads.controller;

import com.domi.philosophyreads.entities.Book;
import com.domi.philosophyreads.entities.dto.BookDto;
import com.domi.philosophyreads.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/add")
    public void addBook(@RequestBody BookDto bookDto) {
        bookService.addBook(bookDto);
    }

    @GetMapping("/author/{id}")
    public List<Book> getBooksByAuthorId(@PathVariable Long id) {
        return bookService.getBooksByAuthorId(id);
    }
}
