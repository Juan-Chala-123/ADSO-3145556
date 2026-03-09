package com.sena.app.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.sena.app.Entity.Role;
import com.sena.app.Service.RoleService;

@RestController
@RequestMapping("/api/rol")
public class RoleController {
    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Role> create(@RequestBody Role role) {
        Role savedRole = service.save(role);
        return new ResponseEntity<>(savedRole, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Role>> All() {       
        List<Role> role = service.All();
        return new ResponseEntity<>(role, HttpStatus.OK);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Role> update(@PathVariable Long id, @RequestBody Role role) {
    //     Role role2 = service.findById(id).orElseThrow(() -> new RecordNotFoundException("Pesona no encontrada."));

    //     role2.setName(role.getName());
    //     role2.setDescription(role.getDescription());

    //     return ResponseEntity.ok(service.update(role2));
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteById(@PathVariable Long roleId) {
    //     service.deleteById(roleId);
    //     return ResponseEntity.ok("Rol eliminado correctamente.");
    // }
}
