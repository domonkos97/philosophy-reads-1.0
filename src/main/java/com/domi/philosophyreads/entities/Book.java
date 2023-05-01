package com.domi.philosophyreads.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
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
