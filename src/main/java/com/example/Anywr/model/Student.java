package com.example.Anywr.model;

import javax.persistence.*;

import lombok.Data;


@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @ManyToOne(fetch = FetchType.LAZY)
    private Class className;

    @ManyToOne(fetch = FetchType.LAZY)
    private Teacher teacher;

    // Constructors, getters, and setters

    // Constructors, getters, and setters

    // ...
}
