package com.maxhayday.model;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
public class Company {

    public Company(List<Person> persons) {
        this.persons = persons;
    }

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Person> persons;
}
