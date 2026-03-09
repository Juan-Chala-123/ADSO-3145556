package com.sena.app.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sena.app.Entity.Person;
import com.sena.app.IRepository.IPersonRepository;

@Service
public class PersonService {
    @Autowired
    private IPersonRepository repository;

    public Person save(Person person) {
        return repository.save(person);
    }

    public List<Person> All() {
        return repository.findAll();
    }

    // public Person update(Person person) {
    //     return repository.save(person);
    // }

    // public void deleteById(Long personId) {
    //     repository.deleteById(personId);
    // }

    // public Object findById(Long id) {
    //     return repository.findById(id);
    // }
}
