package models;

/**
 * La clase Rectangulo implementa la interfaz FormaGeometrica y representa una forma geométrica de rectángulo.
 */
public class Rectangulo implements FormaGeometrica {
    /**
     * Constructor por defecto de la clase Rectangulo.
     */
    public Rectangulo() {}

    /**
     * Método que dibuja el rectángulo.
     * Implementa el método dibujar de la interfaz FormaGeometrica.
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando rectángulo");
    }

}
