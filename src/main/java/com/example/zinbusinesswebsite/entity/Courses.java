package com.example.zinbusinesswebsite.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private int people;
    private String imgUrl;
    @ManyToOne
    private Company company;

    public Courses(String name, String description, int people, String imgUrl) {
        this.name = name;
        this.description = description;
        this.people = people;
        this.imgUrl = imgUrl;
    }
}
