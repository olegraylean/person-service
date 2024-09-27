package com.rayn_microservices.person_service.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@Entity
public class Actor {

  @Id
  @GeneratedValue
  private UUID id;
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
