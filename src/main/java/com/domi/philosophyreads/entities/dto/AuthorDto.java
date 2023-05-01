package com.domi.philosophyreads.entities.dto;

import com.domi.philosophyreads.entities.Book;
import com.domi.philosophyreads.entities.enums.Nationality;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class AuthorDto {
    private Long id;
    private String name;
    private Long birthDate;
    private Long deathDate;
    private Nationality nationality;

}
