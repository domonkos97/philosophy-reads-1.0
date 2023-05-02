package com.domi.philosophyreads.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Data
@Table( name = "_user")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String userName;
    private String password;
}
