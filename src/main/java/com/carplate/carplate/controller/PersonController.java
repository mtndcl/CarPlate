package com.carplate.carplate.controller;


import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "api/user")
public class PersonController {


    private  final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping("/adduser")
    public  void   addUser(@RequestBody Person person){

        personService.addNewPerson(person);
    }

    @PostMapping("delete/{id}")
    public  void  deletePerson(@PathVariable ("id") Long id){

        personService.deletePerson(id);

    }
    @PostMapping("update/{id}")
    public  void  updatePerson(@RequestBody Person person){

        personService.updatePerson(person);

    }

    @GetMapping("/{id}")
    public  Person  getUser(@PathVariable ("id") Long id){

        Person person=new Person();
        person.setUsername("mtndcl");
        person.setPassword("7Miyemedi");
        person.setCreatedDate(new Date());
        person.setId(id);



        return person ;

    }


}
