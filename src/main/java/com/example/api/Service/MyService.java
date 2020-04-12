package com.example.api.Service;

import com.example.api.Model.Person;
import com.example.api.Repository.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyService {
    @Autowired
    PersonJpaRepository repository;

    public void savePerson(Person person){
       repository.save(person);
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Optional<Person> findById(int id) {
        return repository.findById(id);
    }


    public List<Person> findAllByfirstName(String firstName) {
       return repository.findByFirstName(firstName);
    }
}
