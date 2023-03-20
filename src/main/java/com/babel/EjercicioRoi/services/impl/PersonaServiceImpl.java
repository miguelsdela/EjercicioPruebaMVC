package com.babel.EjercicioRoi.services.impl;

import com.babel.EjercicioRoi.mappers.PersonaMapper;
import com.babel.EjercicioRoi.models.Direccion;
import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.models.Telefono;
import com.babel.EjercicioRoi.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    PersonaMapper personaMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper) {
        this.personaMapper = personaMapper;
    }


    @Override
    @Transactional
    public void insertarPersona(Persona persona) {
        //personaMapper.insertarDireccion();
    }
}
