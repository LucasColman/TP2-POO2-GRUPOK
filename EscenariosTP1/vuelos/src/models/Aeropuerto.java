package models;

/**
 * Clase que representa un aeropuerto en el sistema
 */
public class Aeropuerto {
    private String codigo;
    private String nombre;
    private String ciudad;

    /**
     * Constructor por defecto
     */
    public Aeropuerto() {
    }

    /**
     * Constructor con parámetros
     * @param codigo Código del aeropuerto
     * @param nombre Nombre del aeropuerto
     * @param ciudad Ciudad del aeropuerto
     */
    public Aeropuerto(String codigo, String nombre, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    /** 
     * @return String
     */
    public String getCodigo() {
        return codigo;
    }

    /** 
     * @param codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    public String getCiudad() {
        return ciudad;
    }

    /** 
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Aeropuerto [ciudad=" + ciudad + ", codigo=" + codigo + ", nombre=" + nombre + ", getCiudad()="
                + getCiudad() + ", getCodigo()=" + getCodigo() + ", getNombre()=" + getNombre() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    
}
