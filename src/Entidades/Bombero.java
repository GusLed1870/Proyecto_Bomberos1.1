package Entidades;

import java.time.LocalDate;

public class Bombero {

    //Atributos
    private int id_bombero;
    private String dni;
    private String nombre_ape;
    private LocalDate fecha_nac;
    private int celular;
    private Brigada brigada;
    private String grupoSanguineo;
    private boolean estado;

    //Constructores
    public Bombero() {}

    public Bombero(int id_bombero, String dni, String nombre_ape, LocalDate fecha_nac, int celular, Brigada brigada, String grupoSanguineo, boolean estado) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.brigada = brigada;
        this.grupoSanguineo = grupoSanguineo;
        this.estado = estado;
    }

    //Métodos getter y setter
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

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
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

    //Método toString
    @Override
    public String toString() {
        return "Bombero" + "\nid_bombero: " + id_bombero + "\nDNI: " + dni 
                + "\nNombre y Apellido: " + nombre_ape + "\nFecha de Nacimiento: " + fecha_nac 
                + "\nCelular: " + celular + "\nCógigo de Brigada: " + brigada.getCodBrigada()
                + "\nGrupo Sanguineo: " + grupoSanguineo + "\nEstado: " + estado;
    }  
}