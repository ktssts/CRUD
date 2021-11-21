package com.practice.crud.controller;

import com.practice.crud.domain.Person;
import com.practice.crud.dto.PersonRequestDto;
import com.practice.crud.repository.PersonRepository;
import com.practice.crud.service.PersonService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class PersonController {


    private final PersonRepository personRepository;
    private final PersonService personService;

    //TODO C
    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }

    //TODO R
    @GetMapping("/api/persons")
    public List<Person> getPersons(){
        return personRepository.findAll();
    }

    //TODO U
    @PutMapping("/api/persons/{id}")
    public Long udatePersons(@PathVariable Long id,@RequestBody PersonRequestDto requestDto){
        return personService.update(id,requestDto);
    }

    //TODO D
    @GetMapping("/api/persons/{id}")
    public Long deletePersons (@PathVariable Long id) {
        personRepository.deleteById(id);
        return id;
    }






}
