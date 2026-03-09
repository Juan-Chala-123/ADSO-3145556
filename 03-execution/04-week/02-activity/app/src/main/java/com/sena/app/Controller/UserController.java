package com.sena.app.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.sena.app.Entity.User;
import com.sena.app.Service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<User> create(@RequestBody User person) {
        User savedUser = service.save(person);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> All() {       
        List<User> user = service.All();
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user) {
    //     User user2 = service.findById(id).orElseThrow(() -> new RecordNotFoundException("Pesona no encontrada."));

    //     user2.setUser(user.getUser());
    //     user2.setPassword(user.getPassword());

    //     return ResponseEntity.ok(service.update(user2));
    // }

    // @DeleteMapping("/{id}")
    // public ResponseEntity<String> deleteById(@PathVariable Long userId) {
    //     service.deleteById(userId);
    //     return ResponseEntity.ok("Usuario eliminado correctamente.");
    // }
}
