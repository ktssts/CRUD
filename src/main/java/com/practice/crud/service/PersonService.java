package com.practice.crud.service;

import com.practice.crud.domain.Person;
import com.practice.crud.dto.PersonRequestDto;
import com.practice.crud.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PersonService {

    private final PersonRepository personRepository;
    @Transactional
    public Long update(Long id, PersonRequestDto requestDto){
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 id가 존재하지 않습니다."));
        person.update(requestDto);
        return person.getId();
    }

}
