package models;
/**
 * Implementación de la estrategia de envío regular.
 */
public class EnvioRegular implements EstrategiaEnvio {
    /**
     * Calcula el costo del envío regular.
     * @return el costo del envío regular.
     */
    @Override
    public double calcularCosto() {
        return 5.0;
    }
}
