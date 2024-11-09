
/**
 * La clase abstracta PaymentFactory define un método abstracto para la creación de objetos de tipo Payment.
 * Las subclases deben implementar el método crearPago para instanciar objetos específicos de Payment.
 */
public abstract class PaymentFactory {
    public abstract Payment crearPago();

}
