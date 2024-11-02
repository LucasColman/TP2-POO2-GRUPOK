package model;

/**
 * La clase StateAmarillo representa el estado amarillo de un semáforo.
 * Implementa la interfaz SemaforoEstado y define el comportamiento del semáforo
 * cuando está en el estado amarillo.
 * 
 * <p>En este estado, el método {@code handle} imprime un mensaje indicando que
 * el semáforo está en amarillo y cambia el estado del contexto a {@code StateRojo}.
 * 
 * @see SemaforoEstado
 * @see SemaforoContext
 * @see StateRojo
 */
public class StateAmarillo implements SemaforoEstado {

    @Override
    public void handle(SemaforoContext contexto) {
        System.out.println("El semaforo esta en AMARILLO");
        contexto.setEstado(new StateRojo()); // Cambiar
    }

}
