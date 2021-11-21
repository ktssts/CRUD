package com.practice.crud.repository;

import com.practice.crud.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person,Long> {
//    List<Person> findByOrderByCreatedAtDesc();
}
