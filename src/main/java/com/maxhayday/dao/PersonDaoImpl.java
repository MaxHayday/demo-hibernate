package com.maxhayday.dao;

import com.maxhayday.model.Company;
import com.maxhayday.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PersonDaoImpl implements PersonDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public void savePerson(Person person) {

        entityManager.persist(person);
    }

    @Override
    public void saveCompany(Company company) {
        entityManager.persist(company);
    }
}
