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
//@Entity
//@Table
public class Company {

//  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private LocalDate birthDate;
  private LocalDate dateOfDeath;
}
