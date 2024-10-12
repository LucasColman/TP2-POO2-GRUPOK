package modelos;


/**
 * Clase que representa un Libro con información sobre su título, autor, cantidad de páginas y estado.
 * 
 * */


public class Libro {
    private String titulo;
    private String autor;
    private int cantidadDePaginas;
    private String estado;

    /**
     * Constructor vacío de la clase Libro.
     */
    public Libro() {
    }

    /**
     * Constructor de la clase Libro con parámetros.
     * 
     * @param titulo            El título del libro.
     * @param autor             El autor del libro.
     * @param cantidadDePaginas La cantidad de páginas del libro.
     * @param estado            El estado actual del libro (ej. disponible, prestado, etc.).
     */
    public Libro(String titulo, String autor, int cantidadDePaginas, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDePaginas = cantidadDePaginas;
        this.estado = estado;
    }

    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * 
     * @param titulo El nuevo título del libro.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * 
     * @return El autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * 
     * @param autor El nuevo autor del libro.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene la cantidad de páginas del libro.
     * 
     * @return La cantidad de páginas del libro.
     */
    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    /**
     * Establece la cantidad de páginas del libro.
     * 
     * @param cantidadDePaginas La nueva cantidad de páginas del libro.
     */
    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    /**
     * Obtiene el estado actual del libro.
     * 
     * @return El estado del libro.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del libro.
     * 
     * @param estado El nuevo estado del libro.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Devuelve una representación en cadena del libro, incluyendo el título, autor, cantidad de páginas y estado.
     * 
     * @return Una cadena con la información del libro.
     */
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", cantidadDePaginas=" + cantidadDePaginas + ", estado="
                + estado + "]";
    }

}

