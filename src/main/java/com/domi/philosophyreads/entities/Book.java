package com.domi.philosophyreads.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Book {
    @Id
    private Long id;
    private String title;
    private String synopsis;
    @ManyToOne
    private Philosopher author;

    public String toString(){
        return "User{" +'\n' +
                "id=" + id + "," + '\n' +
                "title=" + title +"," + '\n' +
                "synopsis=" + synopsis + "," +'\n' +
                "author=" + author +"," + '\n' + "}";
    }

}
