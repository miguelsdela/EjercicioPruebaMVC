package com.babel.EjercicioRoi.models;

public class Telefono {
    private int telefono_Id;
    private int persona_Id;
    private String telefono;

    public Telefono(int telefono_Id, int persona_Id, String telefono) {
        this.telefono_Id = telefono_Id;
        this.persona_Id = persona_Id;
        this.telefono = telefono;
    }

    public int getTelefono_Id() {
        return telefono_Id;
    }

    public void setTelefono_Id(int telefono_Id) {
        this.telefono_Id = telefono_Id;
    }

    public int getPersona_Id() {
        return persona_Id;
    }

    public void setPersona_Id(int persona_Id) {
        this.persona_Id = persona_Id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
