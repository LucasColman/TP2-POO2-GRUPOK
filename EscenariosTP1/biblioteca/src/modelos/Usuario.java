package modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un Usuario con nombre, apellido y una lista de préstamos asociados.
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private List<Prestamo> prestamos;

    /**
     * Constructor vacío de la clase Usuario.
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase Usuario con parámetros.
     * 
     * @param nombre   El nombre del usuario.
     * @param apellido El apellido del usuario.
     * @param prestamos La lista de préstamos asociados al usuario.
     */
    public Usuario(String nombre, String apellido, List<Prestamo> prestamos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.prestamos = new ArrayList<Prestamo>();
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre El nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del usuario.
     * 
     * @return El apellido del usuario.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del usuario.
     * 
     * @param apellido El nuevo apellido del usuario.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene la lista de préstamos del usuario.
     * 
     * @return La lista de préstamos asociados al usuario.
     */
    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    /**
     * Establece la lista de préstamos del usuario.
     * 
     * @param prestamos La nueva lista de préstamos del usuario.
     */
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    /**
     * Método para solicitar un préstamo. Imprime un mensaje indicando que se está solicitando un préstamo.
     */
    public void solicitarPrestamo() {
        System.out.println("Solicitando prestamo");
    }

    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", prestamos=" + prestamos + "]";
    }

    

}
