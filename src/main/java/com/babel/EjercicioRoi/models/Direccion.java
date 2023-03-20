package com.babel.EjercicioRoi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Direccion {

    @NotNull
    private int tipo_via_id;
    @NotNull
    private String nombre_calle;
    @NotNull
    private String num;
    private String piso;
    private String puerta;
    private String escalera;
    private String otro_dato;
    @NotNull
    private String cod_postal;
    @NotNull
    private String municipio;
    @NotNull
    private String cod_provincia;

}
