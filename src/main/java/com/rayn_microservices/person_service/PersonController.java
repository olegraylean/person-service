package com.rayn_microservices.person_service;

import com.rayn_microservices.person_service.model.Actor;
import com.rayn_microservices.person_service.model.Director;
import com.rayn_microservices.person_service.model.Writer;
import com.rayn_microservices.person_service.service.ActorService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/persons")
public class PersonController {

  private final ActorService actorService;

  public PersonController(ActorService actorService) {
    this.actorService = actorService;
  }

  @GetMapping("/actor/{name}")
  public ResponseEntity<Actor> getActor(@PathVariable UUID id) {
    Actor actor = actorService.findByUUID(id);
    return new ResponseEntity<>(actor, HttpStatus.OK);
  }

  @GetMapping("/search/actor/{name}")
  public ResponseEntity<List<Actor>> findActorByName(@PathVariable String name) {
    List<Actor> actors = actorService.findByName(name);
    return new ResponseEntity<>(actors, HttpStatus.OK);
  }

  @GetMapping("/writer/{id}")
  public Writer getWriter(@PathVariable int id) {
    return new Writer();
  }

  @GetMapping("/director/{id}")
  public Director getDirector(@PathVariable int id) {
    return new Director();
  }

  @GetMapping("/director/movie/{movie}")
  public Director getDirector(@PathVariable String movie) {
    return Director.builder().id(1l).fullName("Pitter Dinclage").movie(movie).build();
  }


  @PostMapping("/actors")
  public ResponseEntity<Actor> addActor(@RequestBody Actor actor) {
    Actor savedActor = actorService.saveActor(actor);
    return new ResponseEntity<>(savedActor, HttpStatus.CREATED);
  }
}