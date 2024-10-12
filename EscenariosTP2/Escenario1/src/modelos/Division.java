package modelos;

/**
 * Clase para realizar la división de dos números
 */
public class Division {
    /**
     * Realiza la división de dos números
     * @param numerador Numerador
     * @param denominador Denominador
     * @return Resultado de la división
     * @throws DivisionPorCeroException Si el denominador es cero
     */
    public static double dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }
}
