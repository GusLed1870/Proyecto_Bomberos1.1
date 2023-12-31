package Entidades;

import java.time.LocalDate;

public class Bombero {

    private int id_bombero;
    private String dni;
    private String nombre_ape;
    private LocalDate fecha_nac;
    private long celular;
    private Brigada brigada;
    private String grupoSanguineo;
    private boolean estado;

    public Bombero() {}

    public Bombero(String dni, String nombre_ape, LocalDate fecha_nac, long celular, Brigada brigada, String grupoSanguineo, boolean estado) {
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.brigada = brigada;
        this.grupoSanguineo = grupoSanguineo;
        this.estado = estado;
    }

    public Bombero(int id_bombero, String dni, String nombre_ape, LocalDate fecha_nac, long celular, Brigada brigada, String grupoSanguineo, boolean estado) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.brigada = brigada;
        this.grupoSanguineo = grupoSanguineo;
        this.estado = estado;
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID: " + id_bombero + "    DNI: " + dni 
                + "    " + nombre_ape + "    Fecha de Nacimiento: " + fecha_nac 
                + "    Celular: " + celular + "    Grupo Sanguineo: " + grupoSanguineo + "    Estado: " + estado;
    }  
}