package com.sena.app.Service;

import org.springframework.stereotype.Service;
import com.sena.app.Entity.Module;
import com.sena.app.IRepository.IModuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ModuleService {
    @Autowired
    private IModuleRepository moduleRepository;

    public Module save(Module module) {
        return moduleRepository.save(module);
    }

    public List<Module> All() {
        return moduleRepository.findAll();
    }

    // public Module update(Module module) {
    //     return moduleRepository.save(module);
    // }

    // public void deleteById(Long moduleId) {
    //     moduleRepository.deleteById(moduleId);
    // }
}
