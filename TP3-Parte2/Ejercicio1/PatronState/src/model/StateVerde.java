package model;

/**
 * La clase StateVerde representa el estado verde de un semáforo.
 * Implementa la interfaz SemaforoEstado y define el comportamiento
 * específico cuando el semáforo está en verde.
 * 
 * <p>En este estado, el método {@code handle} imprime un mensaje indicando
 * que el semáforo está en verde y cambia el estado del contexto a amarillo.
 * 
 * @see SemaforoEstado
 * @see SemaforoContext
 * @see StateAmarillo
 */
public class StateVerde implements SemaforoEstado {

    @Override
    public void handle(SemaforoContext contexto) {
        System.out.println("El semaforo esta en VERDE");
        contexto.setEstado(new StateAmarillo()); // Cambiar
    }

}
