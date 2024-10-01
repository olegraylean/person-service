package com.rayn_microservices.person_service.repository;

import com.rayn_microservices.person_service.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
  List<Person> findByFirstNameContainingIgnoreCaseAndId(String firstName, UUID id);
}