package com.clase06042020.utn.service;

import com.clase06042020.utn.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.clase06042020.utn.repository.PersonRepository;

import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    //instancia el constructor para que nuestros atributos no esten en null
    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository=personRepository;
    }

    public void add(final Person person){
        personRepository.save(person);
    }

    public List<Person> getAll(){
        return personRepository.findAll();
    }

    public Person getPersonById(Integer personId){
        return personRepository.findById(personId).get();
        //.orElseThrow(new HTTPException(httpStatus.NOT_FOUND.value()));
    }
}
