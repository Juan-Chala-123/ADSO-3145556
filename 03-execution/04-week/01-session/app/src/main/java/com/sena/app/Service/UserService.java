package com.sena.app.Service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import com.sena.app.Entity.User;
import com.sena.app.IRepository.IUserRepository;

@Service
public class UserService {
    @Autowired
    private IUserRepository repository;

    public User save(User user) {
        return repository.save(user);
    }

    public List<User> All() {
        return repository.findAll();
    }

    // public User update(User user) {
    //     return repository.save(user);
    // }

    // public void deleteById(Long userId) {
    //     repository.deleteById(userId);
    // }
}
