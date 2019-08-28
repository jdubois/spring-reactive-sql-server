package com.example.reactivesql.reactivesqlserver.repository;

import com.example.reactivesql.reactivesqlserver.domain.Person;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends R2dbcRepository<Person, Long> {
}
