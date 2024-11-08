import models.Circulo;
import models.GrupoForma;
import models.Rectangulo;

/**
 * La clase principal `App` ejecuta la aplicación de dibujo de formas geométricas.
 * Crea instancias de varias formas geométricas y las añade a un grupo para luego dibujarlas.
 */
public class App {

    /**
     * Método principal de la aplicación. Crea instancias de `Circulo`, `Rectangulo` y
     * `GrupoForma`, agrega las formas geométricas al grupo y llama al método para
     * dibujarlas en conjunto.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     * @throws Exception si ocurre alguna excepción durante la ejecución.
     */
    public static void main(String[] args) throws Exception {
        // Crear instancias de las formas geométricas individuales
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();

        // Crear un grupo de formas y agregar las formas geométricas al grupo
        GrupoForma grupo = new GrupoForma();
        grupo.agregar(circulo);
        grupo.agregar(rectangulo);

        // Dibujar todas las formas en el grupo
        grupo.dibujar();
    }
}
