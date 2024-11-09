


/**
 * La clase CreditCardPaymentFactoryes una implementación de la clase abstracta PaymentFactory.
 * Esta clase se encarga de crear instancias de pagos mediante tarjeta de crédito.
 * 
 * @see PaymentFactory
 */
public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public Payment crearPago() {
        return new CreditCardPayment();
    }

}
