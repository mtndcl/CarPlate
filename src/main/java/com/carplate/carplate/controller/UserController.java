package com.carplate.carplate.controller;


import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(path = "api/user")
public class UserController {


    private  final PersonService personService;

    @Autowired
    public UserController(PersonService personService) {
        this.personService = personService;
    }


    @PostMapping("/adduser")
    public  void  addUser(@RequestBody Person person){

        personService.addNewPerson(person);

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
