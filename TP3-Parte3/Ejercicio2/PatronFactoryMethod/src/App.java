/**
 * La clase App demuestra el uso del patrón Factory Method para crear y procesar
 * diferentes tipos de pagos. En el método main, se crean instancias de diferentes
 * fábricas de pago (tarjeta de crédito, PayPal y transferencia bancaria) y se 
 * procesan pagos con cada una de ellas.
 * 
 * @throws Exception si ocurre algún error durante el procesamiento del pago.
 */
public class App {
    public static void main(String[] args) throws Exception {
        PaymentFactory factory;

        // el usuario elige tarjeta de crédito
        factory = new CreditCardPaymentFactory();
        Payment payment1 = factory.crearPago();
        payment1.procesarPago(100.0);

        // el usuario elige PayPal
        factory = new PayPalPaymentFactory();
        Payment payment2 = factory.crearPago();
        payment2.procesarPago(200.0);

        // el usuario elige transferencia bancaria
        factory = new BankTransferPaymentFactory();
        Payment payment3 = factory.crearPago();
        payment3.procesarPago(500.0);
    }
}
