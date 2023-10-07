package Entidades;

public class Brigada {

    // Atributos
    private int codBrigada;
    private String nombre_br;
    private String especialidad;
    private boolean libre;
    private Cuartel cuartel;

    // Constructores
    public Brigada() {
    }

    public Brigada(int codBrigada, String nombre_br, String especialidad, boolean libre, Cuartel cuartel) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }

    public Brigada(String nombre_br, String especialidad, boolean libre, Cuartel cuartel) {
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.cuartel = cuartel;
    }

    // Métodos getter y setter
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

    public Cuartel getCuartel() {
        return cuartel;
    }

    public void setCuartel(Cuartel cuartel) {
        this.cuartel = cuartel;
    }

    // Método toString
    @Override
    public String toString() {
        String cuartelNombre = (cuartel != null) ? cuartel.getNombre_cuartel() : "Sin cuartel asignado";
        String estado;
        if (libre) {
            estado = "libre";
        } else {
            estado = "ocupada";
        }
        return "ID: " + codBrigada + "   Nombre Clave: " + nombre_br
                + "   Especialidad: " + especialidad + "   Estado: " + estado + "   Cuartel: " + cuartelNombre;
    }
}
