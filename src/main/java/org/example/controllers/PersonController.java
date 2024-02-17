package org.example.controllers;

import org.example.models.Person;
import org.example.services.PersonService;
import org.example.util.PersonErrorExceprion;
import org.example.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @ExceptionHandler
    private ResponseEntity<PersonErrorExceprion> getErrorPage(PersonNotFoundException e){
        PersonErrorExceprion response = new PersonErrorExceprion(e.getMessage(), System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}
