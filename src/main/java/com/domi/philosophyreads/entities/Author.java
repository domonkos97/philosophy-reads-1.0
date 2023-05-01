package com.domi.philosophyreads.entities;

import com.domi.philosophyreads.entities.enums.Nationality;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Author {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany
    private List<Book> books;
    private Long birthDate;
    private Long deathDate;
    private Nationality nationality;

    @Override
    public String toString(){
        return "User{" +'\n' +
                "id=" + id + "," + '\n' +
                "name=" + name +"," + '\n' +
                "books=" + books + "," +'\n' +
                "birthDate=" + birthDate +"," + '\n' +
                "deathDate=" + deathDate + "," +'\n' +
                "nationality=" + nationality +'\n' + "}";
    }
}
