/**
 * Clase que representa una mesa en el sistema.
 * Cada mesa tiene un identificador único.
 */
public class Mesa {

    /** Identificador único de la mesa */
    private int idMesa;

    /**
     * Constructor por defecto.
     * Permite crear una instancia de Mesa sin inicializar su identificador.
     */
    public Mesa() {
        // Constructor vacío
    }

    /**
     * Constructor parametrizado.
     * Inicializa el identificador de la mesa al momento de crear la instancia.
     * 
     * @param idMesa Identificador único de la mesa.
     */
    public Mesa(int idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * Obtiene el identificador de la mesa.
     * 
     * @return El identificador de la mesa.
     */
    public int getIdMesa() {
        return idMesa;
    }

    /**
     * Establece el identificador de la mesa.
     * 
     * @param idMesa El identificador de la mesa.
     */
    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena
     * de la instancia de la mesa.
     * 
     * @return Una cadena con los atributos de la mesa.
     */
    @Override
    public String toString() {
        return "Mesa{" +
                "idMesa=" + idMesa +
                '}';
    }
}
