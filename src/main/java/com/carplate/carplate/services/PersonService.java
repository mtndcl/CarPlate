package com.carplate.carplate.services;


import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    public  void  addNewPerson(Person person){

       personRepository.saveAndFlush(person);

    }


}
