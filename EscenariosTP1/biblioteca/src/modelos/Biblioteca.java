package modelos;

import java.util.ArrayList;
import java.util.List;


/**
 * Clase que representa una Biblioteca, que contiene información sobre usuarios y libros.
 */
/**
 * Clase que representa una Biblioteca, que contiene información sobre usuarios y libros.
 */

public class Biblioteca {
    private Usuario usuario;
    private Libro libro;
    private List<Usuario> usuarios;
    private List<Libro> libros;

    /**
     * Constructor vacío de la clase Biblioteca.
     */
    public Biblioteca() {
    }

    /**
     * Constructor de la clase Biblioteca con parámetros.
     * 
     * @param usuario  El usuario principal de la biblioteca.
     * @param libro    El libro principal asociado a la biblioteca.
     * @param usuarios La lista de usuarios registrados en la biblioteca.
     * @param libros   La lista de libros disponibles en la biblioteca.
     */
    public Biblioteca(Usuario usuario, Libro libro, List<Usuario> usuarios, List<Libro> libros) {
        this.usuario = usuario;
        this.libro = libro;
        this.usuarios = new ArrayList<Usuario>();
        this.libros = new ArrayList<Libro>();
    }

    /**
     * Obtiene el usuario principal de la biblioteca.
     * 
     * @return El usuario principal de la biblioteca.
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Establece el usuario principal de la biblioteca.
     * 
     * @param usuario El nuevo usuario principal de la biblioteca.
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el libro principal de la biblioteca.
     * 
     * @return El libro principal de la biblioteca.
     */
    public Libro getLibro() {
        return libro;
    }

    /**
     * Establece el libro principal de la biblioteca.
     * 
     * @param libro El nuevo libro principal de la biblioteca.
     */
    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    /**
     * Obtiene la lista de usuarios registrados en la biblioteca.
     * 
     * @return La lista de usuarios registrados en la biblioteca.
     */
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    /**
     * Establece la lista de usuarios registrados en la biblioteca.
     * 
     * @param usuarios La nueva lista de usuarios registrados en la biblioteca.
     */
    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    /**
     * Obtiene la lista de libros disponibles en la biblioteca.
     * 
     * @return La lista de libros disponibles en la biblioteca.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Establece la lista de libros disponibles en la biblioteca.
     * 
     * @param libros La nueva lista de libros disponibles en la biblioteca.
     */
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    /**
     * Devuelve una representación en cadena de la Biblioteca, que incluye el usuario, el libro, la lista de usuarios y la lista de libros.
     * 
     * @return Una cadena con la información de la biblioteca.
     */
    @Override
    public String toString() {
        return "Biblioteca [usuario=" + usuario + ", libro=" + libro + ", usuarios=" + usuarios + ", libros=" + libros
                + "]";
    }

}

