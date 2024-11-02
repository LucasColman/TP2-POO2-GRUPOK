package model;

/**
 * La interfaz SemaforoEstado define el método que debe implementar cualquier estado
 * del semáforo. Cada estado del semáforo debe manejar la transición del semáforo
 * a su siguiente estado.
 */
public interface SemaforoEstado {
    void handle(SemaforoContext semaforo);
}
