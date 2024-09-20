package com.rayn_microservices.person_service.model;

import java.time.LocalDate;

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
public class Director {

  private long id;
  private String fullName;
  private String movie;
  private LocalDate birthDate;
  private LocalDate dateOfDeath;
}
