package com.clase06042020.utn.controller;

import com.clase06042020.utn.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.clase06042020.utn.service.PersonService;

import javax.validation.Valid;
import java.util.List;

@RestController// manejo de rutas puerta de acceso a tu servidor libero la clase
@RequestMapping("/person")
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(final PersonService personService){
        this.personService=personService;
    }

    @GetMapping("/")
    public List<Person> getAll(){
        return personService.getAll();
    }

    @GetMapping("/{personId}")
    //@PathVariable viene por url es parte de la url  /?PersonId=1&name= .... o lo que sea
    //@RequestParam un parametro que viene despues
    public Person getPersonById(@PathVariable Integer personId ){
        return personService.getPersonById(personId);
    }

    @PostMapping("/")
    public void addPerson(@RequestBody @Valid Person person){
        personService.add(person);
    }
}
