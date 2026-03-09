package com.sena.app.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sena.app.Entity.Person;
import com.sena.app.Service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Person> create(@RequestBody Person person) {
        Person savedPerson = service.save(person);
        return new ResponseEntity<>(savedPerson, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Person>> All() {       
        List<Person> people = service.All();
        return new ResponseEntity<>(people, HttpStatus.OK);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Person> update(@PathVariable Long id, @RequestBody Person person) {
    //     Person person2 = service.findById(id);

    //     if (service.findById(id) == null) {
    //         System.out.println("Persona no encontrada.");
    //     } else {
    //         person2.setFirstName(person.getFirstName());
    //         person2.setLastName(person.getLastName());
    //         person2.setAddress(person.getAddress());
    //         person2.setPhone(person.getPhone());
    //         person2.setEmail(person.getEmail());
    //         person2.setStatus(person.getStatus());
    //     }

    //     return ResponseEntity.ok(service.update(person2));
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteById(@PathVariable Long personId) {
    //     service.deleteById(personId);
    //     return ResponseEntity.ok("Persona eliminada correctamente.");
    // }
    
}
