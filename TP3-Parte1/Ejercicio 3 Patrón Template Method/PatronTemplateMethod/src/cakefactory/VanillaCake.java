package cakefactory;

/**
 * Clase concreta que extiende de Cake y proporciona la implementación
 * específica de los métodos abstractos para un pastel de vainilla.
 */
public class VanillaCake extends Cake {

    /**
     * Implementación del método prepareIngredients() para el pastel de vainilla.
     * Este método prepara los ingredientes necesarios para un pastel de vainilla.
     */
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando ingredientes para pastel de vainilla: harina, azúcar, vainilla, huevos.");
    }

    /**
     * Implementación del método decorateCake() para el pastel de vainilla.
     * Este método define cómo se debe decorar el pastel de vainilla.
     */
    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel con crema de vainilla y fresas.");
    }
}
