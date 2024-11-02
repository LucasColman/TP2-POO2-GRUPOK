package models;
/**
 * Interface para la estrategia de envío.
 */
public interface EstrategiaEnvio {
    /**
     * Calcula el costo del envío.
     * @return el costo del envío.
     */
    double calcularCosto();
}
