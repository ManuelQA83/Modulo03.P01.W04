package com.example.manuelqa.modulo03p01w04;

/**
 * Created by Manuel QA on 01/07/2017.
 */

public class Mascota {
    private int foto;
    private String nombre;
    private int ratin;

    public Mascota(int foto, String nombre, int ratin) {
        this.foto = foto;
        this.nombre = nombre;
        this.ratin = ratin;
    }

    public int getFoto() {
        return foto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRatin() {
        return ratin;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRatin(int ratin) {
        this.ratin = ratin;
    }
}

