

/**
 * La clase BankTransferPaymentFactory es una implementación de la clase abstracta PaymentFactory.
 * Esta clase se encarga de crear instancias de pagos mediante transferencia bancaria.
 * 
 * @see PaymentFactory
 */
public class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    public Payment crearPago() {
        return new BankTransferPayment();
    }

}
