package model;

/**
 * La clase SemaforoContext representa el contexto de un semáforo que maneja su estado actual.
 * Utiliza el patrón de diseño State para cambiar su comportamiento basado en su estado.
 */
public class SemaforoContext {

    private SemaforoEstado estadoActual;


    public SemaforoContext() {
       this.estadoActual = new StateRojo(); // Estado inicial
    }

    public void setEstado(SemaforoEstado estado) {
        estadoActual = estado;
    }

    public void cambiarEstado() {
        estadoActual.handle(this);
    }

}
