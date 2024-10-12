package models;

/**
 * Clase que representa una aerolínea en el sistema
 */
public class Aerolinea {
    private String nombre;

    /**
     * Constructor por defecto
     */
    public Aerolinea() {
    }

    /**
     * Constructor con parámetros
     * @param nombre Nombre de la aerolínea
     */
    public Aerolinea(String nombre) {
        this.nombre = nombre;
    }

    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
