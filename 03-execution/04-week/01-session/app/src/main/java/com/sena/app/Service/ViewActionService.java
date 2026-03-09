package com.sena.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.sena.app.Entity.ViewAction;
import com.sena.app.IRepository.IViewActionRepository;

@Service
public class ViewActionService {
    @Autowired
    private IViewActionRepository repository;

    public ViewAction save(ViewAction viewAction) {
        return repository.save(viewAction);
    }

    public List<ViewAction> All() {
        return repository.findAll();
    }

    // public ViewAction update(ViewAction viewAction) {
    //     return repository.save(viewAction);
    // }

    // public void deleteById(Long viewActionId) {
    //     repository.deleteById(viewActionId);
    // }
}
