package com.domi.philosophyreads.service;

import com.domi.philosophyreads.entities.Book;
import com.domi.philosophyreads.entities.dto.BookDto;
import com.domi.philosophyreads.presistance.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorService authorService;

    @Autowired
    public BookService(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    public List<Book> getAllBooks() {
        Sort sortByTitleDesc = Sort.by(Sort.Direction.DESC, "title");
        return bookRepository.findAll(sortByTitleDesc);
    }

    public Book getBookById(Long id) {
        return bookRepository.getReferenceById(id);
    }

    public List<Book> getBooksByAuthorId(Long id) {
        return bookRepository.getBooksByAuthorId(id);
    }

    public void addBook(BookDto bookDto){
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setAuthor(authorService.getAuthorById(bookDto.getAuthorId()));
        book.setSynopsis(bookDto.getSynopsis());
        book.setTitle(bookDto.getTitle());
        bookRepository.save(book);
    }
}
