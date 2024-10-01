package com.rayn_microservices.person_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

  @Id
  @GeneratedValue
  private UUID id;
  private String type;
  private String firstName;
  private String lastName;
  private Date birthDate;
  private LocalDate dateOfDeath;
//
//  @ElementCollection
//  @CollectionTable(name = "actor_movies", joinColumns = @JoinColumn(name = "actor_id"))
//  @Column(name = "movie_id")
//  private List<UUID> movieIds = new ArrayList<>();
}
