package service;

import entity.Person;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import repository.MyRepository;

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
