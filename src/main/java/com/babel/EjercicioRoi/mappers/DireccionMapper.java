package com.babel.EjercicioRoi.mappers;

import com.babel.EjercicioRoi.models.Direccion;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

@Mapper
public interface DireccionMapper {

    @Insert("INSERT INTO SCORING.DIRECCION (DIRECCION_ID, TIPO_VIA_ID, NOMBRE_CALLE, NUM, PISO, PUERTA, ESCALERA, OTRO_DATO, COD_POSTAL, MUNICIPIO," +
            "COD_PROVINCIA) VALUES (#{tipo_via_id}, #{nombre_calle}, #{num}, #{piso}, #{puerta}, #{escalera}, #{otro_dato}, #{cod_postal}, #{municipio}, #{cod_provincia})")

    void insertarDireccion(Direccion direccion);
}
