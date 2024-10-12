/**
 * Clase que representa un cliente en el sistema.
 * Contiene los atributos básicos del cliente como nombre y apellido.
 */
public class Cliente {

    /** Nombre del cliente */
    private String nombre;

    /** Apellido del cliente */
    private String apellido;

    /**
     * Constructor por defecto.
     * Requerido si se necesita crear una instancia sin inicializar sus atributos.
     */
    public Cliente() {
        // Constructor vacío
    }

    /**
     * Constructor parametrizado.
     * Permite inicializar los atributos del cliente al momento de crear la instancia.
     * 
     * @param nombre   El nombre del cliente.
     * @param apellido El apellido del cliente.
     */
    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return El nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre El nombre del cliente.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del cliente.
     * 
     * @return El apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del cliente.
     * 
     * @param apellido El apellido del cliente.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena
     * de la instancia del cliente.
     * 
     * @return Una cadena con los atributos del cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
