package com.rayn_microservices.person_service.service.impl;

import com.rayn_microservices.person_service.model.Person;
import com.rayn_microservices.person_service.repository.PersonRepository;
import com.rayn_microservices.person_service.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PersonServiceImpl implements PersonService {
  private final PersonRepository personRepository;

  public PersonServiceImpl(PersonRepository personRepository) {
    this.personRepository = personRepository;
  }

  @Override
  public Person findByUUID(UUID uuid) {
    return personRepository.getReferenceById(uuid);
  }

  @Override
  public Person savePerson(Person Person) {
    return personRepository.save(Person);
  }

  @Override
  public Person updatePerson(Long id, Person Person) {
    return personRepository.save(Person);
  }

  @Override
  public void deletePerson(UUID id) {
    personRepository.deleteById(id);
  }

  @Override
  public List<Person> searchPersonsByTypeAndNameAndId(String type, String name, UUID id) {
    return personRepository.findByFirstNameContainingIgnoreCaseAndId(name, id);
  }
}
