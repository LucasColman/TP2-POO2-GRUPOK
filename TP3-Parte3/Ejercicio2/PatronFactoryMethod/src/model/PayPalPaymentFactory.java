

/**
 * La clase  PayPalPaymentFactory es una implementación de la clase abstracta PaymentFactory.
 * Esta clase se encarga de crear instancias de pagos mediante PayPal
 * 
 * @see PaymentFactory
 */

public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public Payment crearPago() {
        return new PayPalPayment();
    }

}
