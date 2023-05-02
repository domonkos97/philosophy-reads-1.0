package com.domi.philosophyreads.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table( name = "_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
    @OneToMany
    private List<Book> books;

    public String toString(){
        return "User{" +'\n' +
                "id=" + id + "," + '\n' +
                "userName=" + userName + "}";
    }
}
