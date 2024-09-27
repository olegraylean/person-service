package com.rayn_microservices.person_service;

import com.rayn_microservices.person_service.model.Actor;
import com.rayn_microservices.person_service.model.Director;
import com.rayn_microservices.person_service.model.Writer;
import com.rayn_microservices.person_service.model.dto.ActorDto;
import com.rayn_microservices.person_service.service.ActorService;

import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/persons")
public class PersonController {

  private final ActorService actorService;
  private Environment environment;

  public PersonController(ActorService actorService, Environment environment) {
    this.actorService = actorService;
    this.environment = environment;
  }

  @GetMapping("/actor/{name}")
  public ResponseEntity<Actor> getActor(@PathVariable UUID id) {
    Actor actor = actorService.findByUUID(id);
    return new ResponseEntity<>(actor, HttpStatus.OK);
  }

  @GetMapping("/search/actor/{name}/id/{id}")
  public ResponseEntity<ActorDto> findActorByName(@PathVariable String name, @PathVariable UUID id) {
    Actor actor = actorService.searchActorsByNameAndId(name, id).getFirst();
    String port = environment.getProperty("local.server.port");
    ActorDto dto = new ActorDto(actor, port);
    return new ResponseEntity<>(dto, HttpStatus.OK);
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

  @PutMapping("/{id}")
  public ResponseEntity<Actor> updateActor(@PathVariable Long id, @RequestBody Actor actor) {
    return ResponseEntity.ok(actorService.updateActor(id, actor));
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteActor(@PathVariable UUID id) {
    actorService.deleteActor(id);
    return ResponseEntity.noContent().build();
  }

  @GetMapping("/search")
  public ResponseEntity<List<Actor>> searchActorsByNameAndId(@RequestParam String name, @RequestParam UUID id) {
    return ResponseEntity.ok(actorService.searchActorsByNameAndId(name, id));
  }
}