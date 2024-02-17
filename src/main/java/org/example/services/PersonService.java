package org.example.services;

import jakarta.persistence.PersistenceException;
import org.example.models.Person;
import org.example.repositories.PersonRepository;
import org.example.util.PersonNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> findAll() {
        return personRepository.findAll();
    }

    public Person findById(int id) {
        return personRepository.findById(id).orElseThrow(PersonNotFoundException::new);
    }
}
