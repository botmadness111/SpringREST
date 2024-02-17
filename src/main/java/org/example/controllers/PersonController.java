package org.example.controllers;

import org.example.models.Person;
import org.example.services.PersonService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {
    PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public List<Person> getPeoplePage() {
        return personService.findAll();
    }

    @GetMapping("/{id}")
    public Person getPersonPage(@PathVariable(value = "id") int id) {
        return personService.findById(id);
    }

}
