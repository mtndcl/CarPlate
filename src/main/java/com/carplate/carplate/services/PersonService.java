package com.carplate.carplate.services;


import com.carplate.carplate.Entity.Person;
import com.carplate.carplate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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


    public void deletePerson(Long id) {

        personRepository.deleteById(id);
    }

    public void updatePerson(Person person) {
        Optional<Person> personExist=personRepository.findById(person.getId());
        if (personExist.isPresent()){
            personExist.get().setUsername(person.getUsername());
            personRepository.saveAndFlush(personExist.get());
        }

    }
}
