package com.utn.spring.controller;

import com.utn.spring.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping("/")
    public Person getPerson(){
        return  new Person("Ivan","Graciarena");
    }
}
