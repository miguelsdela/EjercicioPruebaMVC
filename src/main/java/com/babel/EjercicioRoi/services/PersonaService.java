package com.babel.EjercicioRoi.services;

import com.babel.EjercicioRoi.models.Direccion;
import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.models.Telefono;

public interface PersonaService {
 //Orden -> direccion, persona, telefono

    Direccion insertaDireccion(Direccion direccion);
    Persona insertaPersona(Persona persona);
    Telefono insertarTelefono(Telefono telefono);
}
