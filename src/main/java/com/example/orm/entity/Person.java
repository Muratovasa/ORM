package com.example.orm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Table(name = "person", schema = "netology")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Person {
    @EmbeddedId
    private PrimaryKeyOfPeople human;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;
    @Column(name = "city_of_living", nullable = false)
    private String cityOfLiving;
}
