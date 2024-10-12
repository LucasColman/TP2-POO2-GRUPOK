import java.sql.Time;

/**
 * Clase que representa un pedido en el sistema.
 * Contiene atributos como el identificador del pedido, su estado y la hora en que se realizó.
 */
public class Pedido {

    /** Identificador único del pedido */
    private int idPedido;

    /** Estado actual del pedido (ej: "Pendiente", "En preparación", "Entregado") */
    private String estado;

    /** Hora en la que se registró el pedido */
    private Time hora;

    /**
     * Constructor por defecto.
     * Permite crear una instancia de Pedido sin inicializar sus atributos.
     */
    public Pedido() {
        // Constructor vacío
    }

    /**
     * Constructor parametrizado.
     * Inicializa los atributos del pedido con los valores proporcionados.
     * 
     * @param idPedido Identificador único del pedido.
     * @param estado   Estado actual del pedido.
     * @param hora     Hora en que se registró el pedido.
     */
    public Pedido(int idPedido, String estado, Time hora) {
        this.idPedido = idPedido;
        this.estado = estado;
        this.hora = hora;
    }

    /**
     * Obtiene el identificador del pedido.
     * 
     * @return El identificador del pedido.
     */
    public int getIdPedido() {
        return idPedido;
    }

    /**
     * Establece el identificador del pedido.
     * 
     * @param idPedido El identificador del pedido.
     */
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    /**
     * Obtiene el estado actual del pedido.
     * 
     * @return El estado del pedido.
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado actual del pedido.
     * 
     * @param estado El estado del pedido.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Obtiene la hora en que se registró el pedido.
     * 
     * @return La hora del pedido.
     */
    public Time getHora() {
        return hora;
    }

    /**
     * Establece la hora en que se registró el pedido.
     * 
     * @param hora La hora del pedido.
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * Sobrescribe el método toString para proporcionar una representación en cadena
     * de la instancia del pedido.
     * 
     * @return Una cadena con los atributos del pedido.
     */
    @Override
    public String toString() {
        return "Pedido{" +
                "idPedido=" + idPedido +
                ", estado='" + estado + '\'' +
                ", hora=" + hora +
                '}';
    }
}
