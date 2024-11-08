import models.Circulo;
import models.GrupoForma;
import models.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        GrupoForma grupo = new GrupoForma();
        
        grupo.agregar(circulo);
        grupo.agregar(rectangulo);

        grupo.dibujar();

    }
}
