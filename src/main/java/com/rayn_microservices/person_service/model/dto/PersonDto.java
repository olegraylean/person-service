package com.rayn_microservices.person_service.model.dto;

import com.rayn_microservices.person_service.model.Actor;

import java.util.UUID;

import com.rayn_microservices.person_service.model.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
  private UUID id;
  private String type;
  private String firstName;
  private String lastName;
  private String environment;

  public PersonDto(Person person,String type, String environment) {
    this.id = person.getId();
    this.type = type;
    this.firstName = person.getFirstName();
    this.lastName = person.getLastName();
    this.environment = environment;
  }
}
