package models;
/**
 * Clase Cliente que utiliza diferentes estrategias de envío.
 */
public class Cliente {
    private EstrategiaEnvio estrategiaEnvio;
    
    /**
     * Establece la estrategia de envío.
     * @param estrategiaEnvio la estrategia de envío a utilizar.
    */
    public void setEstrategia(EstrategiaEnvio estrategiaEnvio) {
        this.estrategiaEnvio = estrategiaEnvio;
    }

    /**
     * Calcula el costo del envío utilizando la estrategia actual.
     * @return el costo del envío.
     */
    public double calcularCosto() {
        return estrategiaEnvio.calcularCosto();
    }
}
