package Escenario1.src.modelos;


public class Division {
    public static double dividir(int numerador, int denominador) throws DivisionPorCeroException {
        if (denominador == 0) {
            throw new DivisionPorCeroException("No se puede dividir por cero");
        }
        return (double) numerador / denominador;
    }
}
