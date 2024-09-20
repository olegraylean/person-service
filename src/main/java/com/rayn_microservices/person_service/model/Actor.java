package com.rayn_microservices.person_service.model;

import java.time.LocalDate;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Actor {

  private long id;
  private String firstName;
  private String lastName;
  private Date birthDate;
  private LocalDate dateOfDeath;
}
