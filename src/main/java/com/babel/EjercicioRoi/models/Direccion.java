package com.babel.EjercicioRoi.models;

public class Direccion {

    private int tipo_via_id;
    private String nombre_calle;
    private String num;
    private String piso;
    private String puerta;
    private String escalera;
    private String otro_dato;
    private String cod_postal;
    private String municipio;
    private String cod_provincia;

    public Direccion(int tipo_via_id, String nombre_calle, String num, String escalera, String otro_dato, String cod_postal, String municipio, String cod_provincia) {
        this.tipo_via_id = tipo_via_id;
        this.nombre_calle = nombre_calle;
        this.num = num;
        this.escalera = escalera;
        this.otro_dato = otro_dato;
        this.cod_postal = cod_postal;
        this.municipio = municipio;
        this.cod_provincia = cod_provincia;
    }

    public int getTipo_via_id() {
        return tipo_via_id;
    }

    public void setTipo_via_id(int tipo_via_id) {
        this.tipo_via_id = tipo_via_id;
    }

    public String getNombre_calle() {
        return nombre_calle;
    }

    public void setNombre_calle(String nombre_calle) {
        this.nombre_calle = nombre_calle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }

    public String getEscalera() {
        return escalera;
    }

    public void setEscalera(String escalera) {
        this.escalera = escalera;
    }

    public String getOtro_dato() {
        return otro_dato;
    }

    public void setOtro_dato(String otro_dato) {
        this.otro_dato = otro_dato;
    }

    public String getCod_postal() {
        return cod_postal;
    }

    public void setCod_postal(String cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCod_provincia() {
        return cod_provincia;
    }

    public void setCod_provincia(String cod_provincia) {
        this.cod_provincia = cod_provincia;
    }
}
