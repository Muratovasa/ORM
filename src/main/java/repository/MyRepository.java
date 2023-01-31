package repository;

import entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class MyRepository {
    private NamedParameterJdbcTemplate template;
    @PersistenceContext
    private EntityManager entityManager;
    private String person;
    public MyRepository(EntityManager entityManager){
        this.entityManager = entityManager;
    }
    public List<Person> getPersonsByCity(String city){
        return entityManager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city")
                .setParameter("city", city).getResultList();
    }
}

