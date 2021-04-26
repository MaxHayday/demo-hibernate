package com.maxhayday.dao;

import com.maxhayday.model.Company;
import com.maxhayday.model.Person;

public interface PersonDao {
    void savePerson(Person person);

    void saveCompany(Company company);
}
