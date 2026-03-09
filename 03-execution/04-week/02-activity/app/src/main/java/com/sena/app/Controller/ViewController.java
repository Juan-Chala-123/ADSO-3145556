package com.sena.app.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.sena.app.Entity.View;
import com.sena.app.Service.ViewService;

@RestController
@RequestMapping("/api/view")
public class ViewController {
    private final ViewService service;

    public ViewController(ViewService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<View> create(@RequestBody View view) {
        View savedView = service.save(view);
        return new ResponseEntity<>(savedView, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<View>> All() {       
        List<View> view = service.All();
        return new ResponseEntity<>(view, HttpStatus.OK);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<View> update(@PathVariable Long id, @RequestBody View view) {
    //     View view2 = service.findById(id).orElseThrow(() -> new RecordNotFoundException("Pesona no encontrada."));

    //     view2.setName(view.getName());
    //     view2.setDescription(view.getDescription());

    //     return ResponseEntity.ok(service.update(view2));
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteById(@PathVariable Long viewId) {
    //     service.deleteById(viewId);
    //     return ResponseEntity.ok("Persona eliminada correctamente.");
    // }
}
