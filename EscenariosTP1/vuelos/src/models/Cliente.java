package models;

/**
 * Clase que representa un cliente en el sistema
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String dni;

    /**
     * Constructor por defecto
     */
    public Cliente() {
    }

    /**
     * Constructor con parámetros
     * @param nombre Nombre del cliente
     * @param apellido Apellido del cliente
     * @param dni DNI del cliente
     */
    public Cliente(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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

    /** 
     * @return String
     */
    public String getApellido() {
        return apellido;
    }

    /** 
     * @param apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /** 
     * @return String
     */
    public String getDni() {
        return dni;
    }

    /** 
     * @param dni
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", getNombre()=" + getNombre()
                + ", getApellido()=" + getApellido() + ", getDni()=" + getDni() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    
}
