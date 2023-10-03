package Entidades;

public class Brigada {

    private int codBrigada;
    private String nombre_br;
    private String especialidad;
    private boolean libre;
    private int nro_cuartel;
    private Bombero bombero;

    public Brigada() {
    }

    public Brigada(int codBrigada, String nombre_br, String especialidad, boolean libre, int nro_cuartel, Bombero bombero) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
        this.bombero = bombero;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombre_br() {
        return nombre_br;
    }

    public void setNombre_br(String nombre_br) {
        this.nombre_br = nombre_br;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNro_cuartel() {
        return nro_cuartel;
    }

    public void setNro_cuartel(int nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
    }

    public Bombero getBombero() {
        return bombero;
    }

    public void setBombero(Bombero bombero) {
        this.bombero = bombero;
    }

    @Override
    public String toString() {
        return "Brigada" + "\nCódigo de Brigada: " + codBrigada + "\nNombre de Brigada: " + nombre_br 
                + "\nEspecialidad: " + especialidad + "\nLibre: " + libre + "\nNro de Cuartel: " + nro_cuartel 
                + "\n" + bombero;
    } 
}
