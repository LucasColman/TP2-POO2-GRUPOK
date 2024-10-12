import modelos.DivisionPorCeroException;
import modelos.Division;
public class App {
    public static void main(String[] args) throws Exception {
        try {
            int numerador = 10;
            int denominador = 0;
            double resultado = Division.dividir(numerador, denominador); // Llamada al método que lanza la excepción
            System.out.println("Resultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }   
}

    