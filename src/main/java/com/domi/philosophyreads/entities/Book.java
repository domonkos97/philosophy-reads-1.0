package com.domi.philosophyreads.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
    public class Book {
    @Id
    private Long id;
    private String title;
    private String synopsis;
    @ManyToOne
    private Author author;

    public String toString(){
        return "User{" +'\n' +
                "id=" + id + "," + '\n' +
                "title=" + title +"," + '\n' +
                "synopsis=" + synopsis + "," +'\n' +
                "author=" + author +"," + '\n' + "}";
    }

}
