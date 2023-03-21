package com.babel.EjercicioRoi.mappers;

import com.babel.EjercicioRoi.models.Telefono;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TelefonoMapper {

    @Insert("INSERT INTO SCORING.TELEFONO_CONTACTO (TELEFONO_ID, PERSONA_ID, TELEFONO) VALUES (#{telefono_Id}, #{persona_Id}, #{telefono})")
    void insertarTelefono(List<Telefono> listaTelefonos);
}
