package com.domi.philosophyreads.service;

import com.domi.philosophyreads.entities.Author;
import com.domi.philosophyreads.entities.dto.AuthorDto;
import com.domi.philosophyreads.presistance.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public List<Author> getAllAuthors(){
        Sort sortByTitleDesc = Sort.by(Sort.Direction.DESC, "name");
        return authorRepository.findAll(sortByTitleDesc);
    }

    public Author getAuthorById(Long id) {
        return authorRepository.getReferenceById(id);
    }

    public void addAuthor(AuthorDto authorDto) {
        throw new UnsupportedOperationException("method not implemented yet :(");
    }
}
