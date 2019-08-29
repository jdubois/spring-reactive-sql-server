package com.example.reactivesql.reactivesqlserver.web;

import com.example.reactivesql.reactivesqlserver.domain.Person;
import com.example.reactivesql.reactivesqlserver.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/persons")
    public Flux<Person> list() {
        return personRepository.findAll();
    }
}
