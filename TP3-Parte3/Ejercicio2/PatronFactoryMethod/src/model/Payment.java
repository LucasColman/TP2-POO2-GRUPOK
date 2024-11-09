

/**
 * La interfaz Payment define el contrato para procesar pagos.
 * Las clases que implementen esta interfaz deben proporcionar
 * una implementación del método procesarPago.
 */
public interface Payment {
    void procesarPago(Double monto);

}
