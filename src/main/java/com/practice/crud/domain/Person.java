package com.practice.crud.domain;


import com.practice.crud.dto.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Getter
public class Person {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private int age;

    public Person(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
        this.age= requestDto.getAge();
    }

    public void update(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
        this.age = requestDto.getAge();
    }

}
