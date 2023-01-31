create table netology.PERSON (
                                 name char(50),
                                 surname char(50),
                                 age numeric,
                                 phone_number char(12),
                                 city_of_living char(50),
                                 primary key (name, surname, age)
);