package models;
/**
 * Implementación de la estrategia de envío internacional.
 */
public class EnvioInternacional implements EstrategiaEnvio {
    /**
     * Calcula el costo del envío internacional.
     * @return el costo del envío internacional.
     */
    @Override
    public double calcularCosto() {
        return 20.0; // Costo fijo para envío internacional
    }
}
