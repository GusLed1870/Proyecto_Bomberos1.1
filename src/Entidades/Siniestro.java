package Entidades;

import java.time.LocalDate;

public class Siniestro {

    //Atributos
    private int codigo;
    private String tipo;
    private LocalDate fecha_siniestro;
    private int coord_X;
    private int coord_Y;
    private String detalles;
    private LocalDate fecha_resol;
    private int puntuacion;
    private Brigada brigada;

    //Constructores
    public Siniestro() {}
    
    public Siniestro(int codigo, String tipo, LocalDate fecha_siniestro, int coord_X, int coord_Y, String detalles, LocalDate fecha_resol, int puntuacion, Brigada brigada) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalles = detalles;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.brigada = brigada;
    }

    //Métodos getter y setter
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDate fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public LocalDate getFecha_resol() {
        return fecha_resol;
    }

    public void setFecha_resol(LocalDate fecha_resol) {
        this.fecha_resol = fecha_resol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }

    //Método toString
    @Override
    public String toString() {
        return "Siniestro" + "\nCódigo: " + codigo + "\nTipo: " + tipo + "\nFecha del siniestro: " + fecha_siniestro 
                + "\nCoord_X: " + coord_X + "\nCoord_Y: " + coord_Y + "\nDetalles: " + detalles 
                + "\nFecha de resolución: " + fecha_resol + "\nPuntuación: " + puntuacion 
                + "\n" + brigada;
    }  
}