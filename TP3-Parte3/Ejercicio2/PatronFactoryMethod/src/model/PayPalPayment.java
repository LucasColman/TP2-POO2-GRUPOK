

/**
 * Clase que representa un pago mediante PayPal
 * Implementa la interfaz Payment.
 */
public class PayPalPayment implements Payment {
    @Override
    public void procesarPago(Double monto) {
        
        System.out.println("Procesando pago con PayPal por $" + monto);
    }

}
