package com.sena.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sena.app.Entity.Role;
import com.sena.app.IRepository.IRoleRepository;

@Service
public class RoleService {
    @Autowired
    private IRoleRepository repository;

    public Role save(Role role) {
        return repository.save(role);
    }

    public List<Role> All() {
        return repository.findAll();
    }

    // public Role update(Role role) {
    //     return repository.save(role);
    // }

    // public void deleteById(Long roleId) {
    //     repository.deleteById(roleId);
    // }
}
