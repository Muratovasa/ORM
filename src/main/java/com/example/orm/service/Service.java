package com.example.orm.service;

import com.example.orm.entity.Person;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import com.example.orm.repository.MyRepository;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
@Data
public class Service {
    private final MyRepository repository;

    public List<Person> getPersonByCity(String city){
        return repository.getPersonsByCity(city);
    }

}
