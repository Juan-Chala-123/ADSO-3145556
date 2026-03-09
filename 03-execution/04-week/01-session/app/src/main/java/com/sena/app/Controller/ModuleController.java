package com.sena.app.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sena.app.Service.ModuleService;
import com.sena.app.Entity.Module;
import java.util.List;

@RestController
@RequestMapping("/api/module")
public class ModuleController {
    private final ModuleService service;

    public ModuleController(ModuleService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Module> create(@RequestBody Module module) {
        Module savedModule = service.save(module);
        return new ResponseEntity<>(savedModule, HttpStatus.CREATED);
    }
    
    // @GetMapping
    // public ResponseEntity<List<Module>> All() {
    //     List<Module> module = service.All();
    //     return new ResponseEntity<>(module, HttpStatus.OK);
    // }
    
    // @PutMapping("/{id}")
    // public ResponseEntity<Module> update(@PathVariable Long moduleId, @RequestBody Module module) {
    //     Module module1 = service.findById(moduleId).orElseThrow(() -> new RecordNotFoundException("Modulo no encontrado."));
        
    //     module1.setName(module.getName());
    //     module1.setDescription(module.getDescription());
    // }
}