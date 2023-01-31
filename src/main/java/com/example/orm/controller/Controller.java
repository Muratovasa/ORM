package com.example.orm.controller;

import com.example.orm.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.orm.service.Service;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final Service personService;

    @GetMapping("/persons/by-city")
    public List<Person> getListPersonsByCity(@RequestParam String city){
        return personService.getPersonByCity(city);
    }
}