package com.example.orm.repository;

import com.example.orm.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.apache.catalina.valves.rewrite.InternalRewriteMap;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;
    /*public MyRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }*/
    public List<Person> getPersonsByCity(String city){
        return entityManager.createQuery("SELECT p FROM Person p WHERE LOWER(p.cityOfLiving)= LOWER( :city)")
                .setParameter("city", city).getResultList();
    }
}

