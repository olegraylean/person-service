package com.rayn_microservices.person_service.model.dto;

import com.rayn_microservices.person_service.model.Actor;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {
  private UUID id;
  private String firstName;
  private String lastName;
  private String environment;

  public ActorDto(Actor actor, String environment) {
    this.id = actor.getId();
    this.firstName = actor.getFirstName();
    this.lastName = actor.getLastName();
    this.environment = environment;
  }
}
