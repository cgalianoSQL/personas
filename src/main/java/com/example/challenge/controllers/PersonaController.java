package com.example.challenge.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.challenge.models.PersonaModel;
import com.example.challenge.services.PersonaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping()
    public ArrayList<PersonaModel> obtenerPersonas(){
        return personaService.obtenerPersonas();
    }

    // Sirve tanto como post y a  la vez al ingresar el mismo dni funciona como put actualizando los datos
    @PostMapping()
    public PersonaModel guardarPersona(@RequestBody PersonaModel persona){
        return this.personaService.guardarPersona(persona);
    }

    @GetMapping( path = "/{dni}")
    public Optional<PersonaModel> obtenerPersonaPorId(@PathVariable("dni") Long dni) {
        return this.personaService.obtenerPorId(dni);
    }

    @DeleteMapping( path = "/{dni}")
    public String eliminarPorId(@PathVariable("dni") Long dni){
        boolean ok = this.personaService.eliminarPersona(dni);
        if (ok){
            return "Se eliminó el persona con dni " + dni;
        }else{
            return "No pudo eliminar el persona con dni" + dni;
        }
    }

}