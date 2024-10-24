package cakefactory;

/**
 * Clase concreta que extiende de Cake y proporciona la implementación
 * específica de los métodos abstractos para un pastel de chocolate.
 */
public class ChocolateCake extends Cake {

    /**
     * Implementación del método prepareIngredients() para el pastel de chocolate.
     * Este método prepara los ingredientes necesarios para un pastel de chocolate.
     */
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparando ingredientes para pastel de chocolate: harina, azúcar, cacao, huevos.");
    }

    /**
     * Implementación del método decorateCake() para el pastel de chocolate.
     * Este método define cómo se debe decorar el pastel de chocolate.
     */
    @Override
    protected void decorateCake() {
        System.out.println("Decorando el pastel con chocolate rallado y glaseado de chocolate.");
    }
}
