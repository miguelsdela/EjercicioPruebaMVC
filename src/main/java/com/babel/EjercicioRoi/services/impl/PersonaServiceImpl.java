package com.babel.EjercicioRoi.services.impl;

import com.babel.EjercicioRoi.models.Direccion;
import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.models.Telefono;
import com.babel.EjercicioRoi.services.PersonaService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaServiceImpl implements PersonaService {
    @Override
    public Direccion insertaDireccion(Direccion direccion) {
        return direccion;
    }

    @Override
    public Persona insertaPersona(Persona persona) {
        return persona;
    }

    @Override
    public Telefono insertarTelefono(Telefono telefono) {
        return telefono;
    }
}
