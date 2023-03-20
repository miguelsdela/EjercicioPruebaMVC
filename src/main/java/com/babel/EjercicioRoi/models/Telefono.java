package com.babel.EjercicioRoi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
@Setter
public class Telefono {
    @NotNull
    private int telefono_Id;
    @NotNull
    private int persona_Id;
    @NotNull
    private String telefono;

}
