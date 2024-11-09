

/**
 * Clase que representa un pago mediante transferencia bancaria.
 * Implementa la interfaz Payment.
 */
public class BankTransferPayment implements Payment {
    @Override
    public void procesarPago(Double monto) {
        
        System.out.println("Procesando pago mediante transferencia bancaria por $" + monto);
    }

}
