package com.babel.EjercicioRoi.models;

import java.util.Date;
import java.util.List;

public class Persona {
    private int persona_id;
    private String nombre;
    private String apellido1;
    private String Apellido2;
    private Direccion direccion_domicilio_id;
    private Direccion direccion_notificacion_id;
    private String nif;
    private Date fecha_nacimiento;
    private String nacionalidad;
    private int scoring;
    private Date fecha_scoring;
    private List<Telefono> telefonos;

    public Persona(int persona_id, String nombre, String apellido1, Direccion direccion_domicilio_id, Direccion direccion_notificacion_id,
                   String nif, Date fecha_nacimiento, String nacionalidad, List<Telefono> telefonos) {
        this.persona_id = persona_id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.direccion_domicilio_id = direccion_domicilio_id;
        this.direccion_notificacion_id = direccion_notificacion_id;
        this.nif = nif;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
        this.telefonos = telefonos;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String apellido2) {
        Apellido2 = apellido2;
    }

    public Direccion getDireccion_domicilio_id() {
        return direccion_domicilio_id;
    }

    public void setDireccion_domicilio_id(Direccion direccion_domicilio_id) {
        this.direccion_domicilio_id = direccion_domicilio_id;
    }

    public Direccion getDireccion_notificacion_id() {
        return direccion_notificacion_id;
    }

    public void setDireccion_notificacion_id(Direccion direccion_notificacion_id) {
        this.direccion_notificacion_id = direccion_notificacion_id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getScoring() {
        return scoring;
    }

    public void setScoring(int scoring) {
        this.scoring = scoring;
    }

    public Date getFecha_scoring() {
        return fecha_scoring;
    }

    public void setFecha_scoring(Date fecha_scoring) {
        this.fecha_scoring = fecha_scoring;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }
}
