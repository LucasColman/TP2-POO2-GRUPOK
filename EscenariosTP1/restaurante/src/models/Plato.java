/**
 * Clase que representa un plato disponible en el sistema.
 * Contiene atributos como el nombre del plato y su precio.
 */
public class Plato {

    /** Precio del plato en unidades monetarias */
    private int precio;

    /** Nombre del plato */
    private String nombre;

    /**
     * Constructor por defecto.
     * Permite crear una instancia de Plato sin inicializar sus atributos.
     */
    public Plato() {
        // Constructor vacío
    }

    /**
     * Constructor parametrizado.
     * Permite inicializar los atributos al momento de crear la instancia.
     * 
     * @param precio El precio del plato.
     * @param nombre El nombre del plato.
     */
    public Plato(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del plato.
     * 
     * @return El precio del plato.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del plato.
     * 
     * @param precio El precio del plato.
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el nombre del plato.
     * 
     * @return El nombre del plato.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del plato.
     * 
     * @param nombre El nombre del plato.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena
     * de la instancia del plato.
     * 
     * @return Una cadena con los atributos del plato.
     */
    @Override
    public String toString() {
        return "Plato{" +
                "precio=" + precio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
