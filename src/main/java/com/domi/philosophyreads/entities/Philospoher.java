package com.domi.philosophyreads.entities;

import com.domi.philosophyreads.entities.enums.Nationality;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Philospoher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Book> books;
    private Date birthDate;
    private Date deathDate;
    private Nationality nationality;
}
