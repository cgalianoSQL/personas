package com.example.challenge.repositories;

import com.example.challenge.models.PersonaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel, Long> {

}