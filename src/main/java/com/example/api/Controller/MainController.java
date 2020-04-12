package com.example.api.Controller;

import com.example.api.Model.Person;
import com.example.api.Service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class MainController {

    @Autowired
    MyService myService;


    @PostMapping("/savePerson")
    public ResponseEntity savePerson(@RequestBody Person person) {
        System.out.println("###############" + person.toString());
        myService.savePerson(person);
        return new ResponseEntity("Done", HttpStatus.OK);
    }

    @GetMapping(value="/getAllPersons")
    public List<Person> getAllPersons() {
        return myService.findAll();
    }

    @GetMapping(value="/getPersonById")
    public Optional<Person> getPersonById(@RequestParam int id) {
        return myService.findById(id);
    }
    @GetMapping(value="/getPersonByName")
    public List<Person> getPersonByName(@RequestParam String firstName) {
        return myService.findAllByfirstName(firstName);
    }



}


