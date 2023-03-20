package com.babel.EjercicioRoi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.NonNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Persona {
    @NotNull
    private int persona_id;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido1;
    private String Apellido2;
    @NotNull
    private Direccion direccion_domicilio_id;
    @NotNull
    private Direccion direccion_notificacion_id;
    @NotNull
    private String nif;
    @NonNull
    private Date fecha_nacimiento;
    @NotNull
    private String nacionalidad;
    @Min(0)
    @Max(8)
    private int scoring;
    private Date fecha_scoring;
    private List<Telefono> telefonos;

}
