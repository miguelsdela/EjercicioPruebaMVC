package com.babel.EjercicioRoi.mappers;

import com.babel.EjercicioRoi.models.Direccion;
import com.babel.EjercicioRoi.models.Persona;
import com.babel.EjercicioRoi.models.Telefono;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonaMapper {
    @Insert("INSERT INTO SCORING.DIRECCION (DIRECCION_ID, TIPO_VIA_ID, NOMBRE_CALLE, NUM, PISO, PUERTA, ESCALERA, OTRO_DATO, COD_POSTAL, MUNICIPIO," +
            "COD_PROVINCIA) VALUES (#{tipo_via_id}, #{nombre_calle}, #{num}, #{piso}, #{puerta}, #{escalera}, #{otro_dato}, #{cod_postal}, #{municipio}, #{cod_provincia})")
    void insertarDireccion(Direccion direccion);

    @Insert("INSERT INTO SCORING.PERSONA (PERSONA_ID, NOMBRE,APELLIDO1, APELLIDO2, DIRECCION_DOMICILIO_ID, DIRECCION_NOTIFICACION_ID, NIF, FECHA_NACIMIENTO," +
            "NACIONALIDAD, SCORING, FECHA_SCORING) VALUES (#{persona_id}, #{nombre}, #{apellido1}, #{apellido2}, #{direccion_domicilio_id}, #{direccion_notificacion_id},"
            + "#{nif}, #{fecha_nacimiento}, #{nacionalidad}, #{scoring}, #{fecha_scoring})")
    void insertarPersona(Persona persona);

    @Insert("INSERT INTO SCORING.TELEFONO_CONTACTO (TELEFONO_ID, PERSONA_ID, TELEFONO) VALUES (#{telefono_Id}, #{persona_Id}, #{telefono})")
    void insertarTelefono(List<Telefono> listaTelefonos);

}
