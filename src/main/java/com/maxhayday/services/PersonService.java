package com.maxhayday.services;

import com.maxhayday.dao.PersonDao;
import com.maxhayday.model.Company;
import com.maxhayday.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
//@Transactional(timeout = 1000)
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @Transactional
    @EventListener(ContextRefreshedEvent.class)
    public void saveManyPersons() {
        List<Person> people = Stream.generate(Person::new)
                .limit(10)
                .collect(Collectors.toList());
        Company company = new Company(people);
        personDao.saveCompany(company);
    }
}
