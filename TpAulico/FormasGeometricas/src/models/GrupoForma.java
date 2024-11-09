package models;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase GrupoForma implementa la interfaz FormaGeometrica y representa un grupo de formas geométricas.
 */
public class GrupoForma implements FormaGeometrica {
    private List<FormaGeometrica> formas = new ArrayList<>();
    
    /**
     * Agrega una forma geométrica al grupo.
     * 
     * @param forma la forma geométrica a agregar
     */
    public void agregar(FormaGeometrica forma) {
        formas.add(forma);
    }

    /**
     * Remueve una forma geométrica del grupo.
     * 
     * @param forma la forma geométrica a remover
     */
    public void remover(FormaGeometrica forma) {
        formas.remove(forma);
    }

    /**
     * Dibuja todas las formas geométricas del grupo.
     * Implementa el método dibujar de la interfaz FormaGeometrica.
     */
    @Override
    public void dibujar() {
        System.out.println("Dibujando grupo de formas:");
        
        for (FormaGeometrica forma : formas) {
            forma.dibujar();
        }
    }
}
