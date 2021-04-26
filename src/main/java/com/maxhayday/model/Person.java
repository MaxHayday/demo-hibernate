package com.maxhayday.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PERSONS")
@Data
//@NamedQuery(name = "allPersons", query = "* from Person  where age:>?")
public class Person {
    @Id
    @GeneratedValue
    private long id;

    @Transient
    private int age;


//    @OneToMany
//    private List<Event> events;
}
