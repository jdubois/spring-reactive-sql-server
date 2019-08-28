package com.example.reactivesql.reactivesqlserver.web;

import com.example.reactivesql.reactivesqlserver.repository.PersonRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonRepository personRepository;
}
