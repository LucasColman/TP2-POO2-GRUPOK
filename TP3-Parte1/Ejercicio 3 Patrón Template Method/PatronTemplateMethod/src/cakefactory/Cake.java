package cakefactory;

/**
 * Clase abstracta que actúa como plantilla en el patrón Template Method.
 * Define el método general makeCake() que no puede ser modificado por las subclases,
 * mientras que delega la implementación de los detalles específicos a las subclases.
 */
public abstract class Cake {

    /**
     * Método Template que define el flujo general para hacer un pastel.
     * Este método no debe ser modificado por las subclases.
     */
    public final void makeCake() {
        prepareIngredients(); // Preparación de los ingredientes específicos del pastel
        bake();               // Hornear el pastel, paso común a todos los tipos de pasteles
        decorateCake();        // Decorar el pastel, definido por las subclases
        pack();                // Empaquetar el pastel, paso común a todos los tipos de pasteles
    }

    /**
     * Método abstracto para preparar los ingredientes del pastel,
     * su implementación es específica de cada tipo de pastel.
     */
    protected abstract void prepareIngredients();

    /**
     * Método abstracto para decorar el pastel,
     * su implementación es específica de cada tipo de pastel.
     */
    protected abstract void decorateCake();

    /**
     * Método para hornear el pastel, común a todos los tipos de pasteles.
     */
    private void bake() {
        System.out.println("Horneando el pastel a 180 grados.");
    }

    /**
     * Método para empaquetar el pastel, común a todos los tipos de pasteles.
     */
    private void pack() {
        System.out.println("Empaquetando el pastel.");
    }
}
