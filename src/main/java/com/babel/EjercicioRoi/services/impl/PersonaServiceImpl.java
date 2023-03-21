package com.babel.EjercicioRoi.services.impl;

import com.babel.EjercicioRoi.mappers.DireccionMapper;
import com.babel.EjercicioRoi.mappers.PersonaMapper;
import com.babel.EjercicioRoi.mappers.TelefonoMapper;
import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    private final PersonaMapper personaMapper;
    private final DireccionMapper direccionMapper;

    private final TelefonoMapper telefonoMapper;

    public PersonaServiceImpl(PersonaMapper personaMapper, DireccionMapper direccionMapper, TelefonoMapper telefonoMapper) {
        this.personaMapper = personaMapper;
        this.direccionMapper = direccionMapper;
        this.telefonoMapper = telefonoMapper;
    }

    @Override
    @Transactional
    public void insertarPersona(Persona persona) {
        direccionMapper.insertarDireccion(persona.getDireccion_domicilio_id());
        direccionMapper.insertarDireccion(persona.getDireccion_notificacion_id());
        personaMapper.insertarPersona(persona);
        telefonoMapper.insertarTelefono(persona.getTelefonos());
    }
}
