package models;

/**
 * La clase Circulo representa una forma geométrica de tipo círculo
 * e implementa la interfaz FormaGeometrica. Esta clase define cómo
 * se debe dibujar un círculo.
 */
public class Circulo implements FormaGeometrica {

    /**
     * Constructor por defecto de la clase Circulo.
     * No recibe parámetros y simplemente crea una instancia de Circulo.
     */
    public Circulo() {}

    /**
     * Método para dibujar el círculo.
     * Implementación de la interfaz FormaGeometrica que muestra un mensaje en consola.
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}

