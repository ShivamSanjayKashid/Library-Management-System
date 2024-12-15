package com.librarymanagement.models;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @ElementCollection
    private List<Long> borrowedBooks = new ArrayList<>();

    @ElementCollection
    private List<Long> writtenBooks = new ArrayList<>();

    // Getters and Setters
    // Constructors
}
