package com.domi.philosophyreads.controller;

import com.domi.philosophyreads.entities.Author;
import com.domi.philosophyreads.entities.dto.AuthorDto;
import com.domi.philosophyreads.service.AuthorService;
import com.nimbusds.jose.proc.SecurityContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {this.authorService = authorService;}

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @PostMapping("/add")
    public void addAuthor(@RequestBody AuthorDto authorDto){
        authorService.addAuthor(authorDto);
    }

//    @GetMapping("/hello")
//    public String sayHi(Authentication authentication){
//        return String.format("You are signed in! \n Principle: %s", authentication.getPrincipal());
//    }

    @GetMapping("/hello")
    public String sayHi(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return String.format("You are signed in! \n Principle: %s", authentication.getPrincipal());
    }
}
