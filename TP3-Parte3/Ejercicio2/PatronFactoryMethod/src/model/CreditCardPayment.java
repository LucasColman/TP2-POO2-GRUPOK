

/**
 * Clase que representa un pago mediante tarjeta de credito
 * Implementa la interfaz Payment.
 */
public class CreditCardPayment implements Payment {

    @Override
    public void procesarPago(Double monto) {
        
        System.out.println("Procesando pago con tarjeta de crédito por $" + monto);
    }
    

}
