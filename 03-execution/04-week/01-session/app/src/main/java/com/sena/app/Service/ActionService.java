package com.sena.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sena.app.Entity.Action;
import com.sena.app.IRepository.IActionRepository;

@Service
public class ActionService {
    @Autowired
    private IActionRepository repository;

    public Action save(Action action) {
        return repository.save(action);
    }

    public List<Action> All() {
        return repository.findAll();
    }

    // public Action update(Action action) {
    //     return repository.save(action);
    // }

    // public void deleteById(Long actionId) {
    //     repository.deleteById(actionId);
    // }
}
