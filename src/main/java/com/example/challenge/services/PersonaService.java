package com.example.challenge.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.challenge.models.PersonaModel;
import com.example.challenge.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    
    public ArrayList<PersonaModel> obtenerPersonas(){
        return (ArrayList<PersonaModel>) personaRepository.findAll();
    }

    public PersonaModel guardarPersona(PersonaModel persona){
        return personaRepository.save(persona);
    }

    public Optional<PersonaModel> obtenerPorId(Long dni){
        return personaRepository.findById(dni);
    }

    public boolean eliminarPersona(Long dni) {
        try{
            personaRepository.deleteById(dni);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}