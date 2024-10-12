package modelos;

/**
 * Clase para manejar la excepción de división por cero
 */
public class DivisionPorCeroException extends Exception {
    /**
     * Constructor por defecto
     * @param mensaje Mensaje de error
     */
    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }
}

 