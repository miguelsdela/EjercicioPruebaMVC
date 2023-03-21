package com.babel.EjercicioRoi.mappers;

import com.babel.EjercicioRoi.models.Direccion;
import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.models.Telefono;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

import java.util.List;

@Mapper
public interface PersonaMapper {

    @Insert("INSERT INTO SCORING.PERSONA ( NOMBRE,APELLIDO1, APELLIDO2, DIRECCION_DOMICILIO_ID, DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO," +
            "NACIONALIDAD, SCORING, FECHA_SCORING) VALUES (#{persona_id}, #{nombre}, #{apellido1}, #{apellido2}, #{direccion_domicilio_id}, #{direccion_notificacion_id},"
            + "#{nif}, #{fecha_nacimiento}, #{nacionalidad}, #{scoring}, #{fecha_scoring})")
    @Options(useGeneratedKeys = true, keyProperty = "persona_id", keyColumn = "PERSONA_ID")
    void insertarPersona(Persona persona);


}
