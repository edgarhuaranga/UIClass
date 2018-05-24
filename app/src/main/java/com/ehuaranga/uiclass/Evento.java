package com.ehuaranga.uiclass;

/**
 * Created by edhuar on 23.05.18.
 */

public class Evento {
    String tipo;
    String titulo;
    String lugar;
    String horaInicio;
    String horaFinal;
    int id_drawable;

    public Evento() {
    }

    public Evento(String tipo, String titulo, String lugar) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.lugar = lugar;
    }


    public int getId_drawable(){
        return id_drawable;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }
}
