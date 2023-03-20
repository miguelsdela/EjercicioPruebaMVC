package com.babel.EjercicioRoi.mappers;

import com.babel.EjercicioRoi.models.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonaMapper {
    @Insert("")
    void insertarDireccion();

    @Insert("INSERT INTO SCORING.PERSONA (PERSONA_ID, NOMBRE,APELLIDO1, APELLIDO2,DIRECCION_DOMICILIO_ID,DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO," +
            "NACIONALIDAD, SCORING, FECHA_SCORING) VALUES (#{persona_id},#{nombre},#{apellido1},#{apellido2},#{direccion_domicilio_id},#{direccion_notificacion_id},"
            + "#{nif},#{fecha_nacimiento},#{nacionalidad},#{scoring},#{fecha_scoring})")
    void insertarPersona(Persona persona);
    @Insert("")
    void insertarTelefono();


}
