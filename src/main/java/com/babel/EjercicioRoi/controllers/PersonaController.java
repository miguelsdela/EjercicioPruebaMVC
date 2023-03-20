package com.babel.EjercicioRoi.controllers;

import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.services.PersonaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    private final PersonaService personaService;


    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping
    public ResponseEntity<String> insertarPersona(){

        return ResponseEntity.ok("Ok");
    }
}
