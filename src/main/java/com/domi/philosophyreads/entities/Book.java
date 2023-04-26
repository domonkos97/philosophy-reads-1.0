package com.domi.philosophyreads.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    private String synopsis;
    @ManyToOne
    private Philospoher author;

}
