package com.rayn_microservices.person_service.service;

import com.rayn_microservices.person_service.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonService {

  Person findByUUID(UUID uuid);

  Person savePerson(Person person);

  Person updatePerson(Long id, Person person);

  void deletePerson(UUID id);

  List<Person> searchPersonsByNameAndId(String name, UUID id);
}
