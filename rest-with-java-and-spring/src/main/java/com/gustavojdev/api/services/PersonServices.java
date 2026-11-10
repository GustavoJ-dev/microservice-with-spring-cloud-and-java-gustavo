package com.gustavojdev.api.services;

import com.gustavojdev.api.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());



    public List<Person> findAll(){

        logger.info("Finding all people");

        List<Person> persons = new ArrayList<>();

        for(int i = 0; i < 8; i++){

            Person person = mockPerson(i);
            persons.add(person);
        }

        return persons;



    }
    public Person findById(String id){

        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Gustavo");
        person.setLastName("Jesus");
        person.setGender("Masculino");
        person.setAddress("Paramirim - Bahia - Brasil");

        return person;

    }

    public Person createPerson(Person person){

        logger.info("Create one Person");

        return person;
    }

    public Person updatePerson(Person person){

        logger.info("updating one Person");

        return person;
    }

    public void deletePerson(String id){

        logger.info("deleting one Person");
    }

    private Person mockPerson(int i){

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("FistName" + i);
        person.setLastName("LastName" + i);
        person.setGender("Masculino");
        person.setAddress("Soma Address in Brasil");

        return person;
    }

}
