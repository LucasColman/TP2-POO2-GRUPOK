package model;

/**
 * La clase StateRojo implementa el estado ROJO de un semáforo.
 * Esta clase es parte del patrón de diseño State, donde cada estado
 * del semáforo se representa como una clase que implementa la interfaz
 * SemaforoEstado.
 * 
 * <p>En el estado ROJO, el semáforo indica a los vehículos que deben detenerse.
 * Al manejar este estado, se imprime un mensaje indicando que el semáforo está
 * en ROJO y luego se cambia el estado del contexto a VERDE.
 * 
 * @see SemaforoEstado
 * @see SemaforoContext
 * @see StateVerde
 */
public class StateRojo implements SemaforoEstado {
    
    @Override
    public void handle(SemaforoContext contexto) {
        System.out.println("El semaforo esta en ROJO");
        contexto.setEstado(new StateVerde()); // Cambiar
    }

}
