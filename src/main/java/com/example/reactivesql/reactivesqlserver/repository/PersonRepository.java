package com.example.reactivesql.reactivesqlserver.repository;

import com.example.reactivesql.reactivesqlserver.domain.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
}
