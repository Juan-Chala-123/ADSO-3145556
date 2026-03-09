package com.sena.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.sena.app.Entity.ViewModule;
import com.sena.app.IRepository.IViewModuleRepository;

@Service
public class ViewModuleService {
    @Autowired
    private IViewModuleRepository repository;

    public ViewModule save(ViewModule viewModule) {
        return repository.save(viewModule);
    }

    public List<ViewModule> All() {
        return repository.findAll();
    }

    // public ViewModule update(ViewModule viewModule) {
    //     return repository.save(viewModule);
    // }

    // public void deleteById(Long viewModuleId) {
    //     repository.deleteById(viewModuleId);
    // }
}
