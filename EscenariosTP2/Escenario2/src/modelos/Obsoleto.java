/**
 * Clase que muestra el uso de la anotación @Deprecated.
 */
public class Obsoleto{
    
    /**
     * @deprecated Este método ha quedado obsoleto. Usa {@link #nuevoMetodo()} en su lugar.
     */
    @Deprecated
    public void viejoMetodo() {
        System.out.println("Este método es obsoleto.");
    }
    
    public void nuevoMetodo() {
        System.out.println("Este es el método nuevo.");
    }
}
