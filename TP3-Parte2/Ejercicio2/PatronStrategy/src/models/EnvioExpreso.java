package models;
/**
 * Implementación de la estrategia de envío expreso.
 */
public class EnvioExpreso implements EstrategiaEnvio {
    /**
     * Calcula el costo del envío expreso.
     * @return el costo del envío expreso.
     */
    @Override
    public double calcularCosto() {
        return 10.0;
    }
}
