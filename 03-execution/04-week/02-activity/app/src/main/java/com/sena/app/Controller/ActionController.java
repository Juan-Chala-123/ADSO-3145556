package com.sena.app.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.sena.app.Entity.Action;
import com.sena.app.Service.ActionService;

@RestController
@RequestMapping("/api/action")
public class ActionController {
    private final ActionService service;

    public ActionController(ActionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Action> create(@RequestBody Action action) {
        Action savedAction = service.save(action);
        return new ResponseEntity<>(savedAction, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Action>> All() {       
        List<Action> action = service.All();
        return new ResponseEntity<>(action, HttpStatus.OK);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Action> update(@PathVariable Long id, @RequestBody Action action) {
    //     Action action2 = service.findById(id).orElseThrow(() -> new RecordNotFoundException("Pesona no encontrada."));

    //     action2.setName(action.getName());
    //     action2.setDescription(action.getDescription());

    //     return ResponseEntity.ok(service.update(action2));
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteById(@PathVariable Long personId) {
    //     service.deleteById(personId);
    //     return ResponseEntity.ok("Persona eliminada correctamente.");
    // }
}
