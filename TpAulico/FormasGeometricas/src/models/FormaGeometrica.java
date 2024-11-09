package models;

/**
 * La interfaz FormaGeometrica define el contrato para cualquier forma geométrica
 * que debe implementar el método para dibujarse a sí misma.
 * Cualquier clase que implemente esta interfaz deberá proporcionar
 * una implementación para el método dibujar.
 */
public interface FormaGeometrica {

    /**
     * Dibuja la forma geométrica.
     * Este método deberá ser implementado por cualquier clase que represente
     * una forma geométrica específica.
     */
    void dibujar();
}
