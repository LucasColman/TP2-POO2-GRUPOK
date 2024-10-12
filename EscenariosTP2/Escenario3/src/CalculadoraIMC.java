/**
 * Clase que calcula el Índice de Masa Corporal (IMC) de una persona.
 */
public class CalculadoraIMC {
    /** Método que calcula el IMC basado en peso (kg) y altura (m)
     * @param peso
     * @param altura
     * @return double
     */
    
    public double calcularIMC(double peso, double altura) {
        // Validación para evitar división por cero o valores negativos
        if (altura <= 0 || peso <= 0) {
            throw new IllegalArgumentException("El peso y la altura deben ser mayores que 0.");
        }

        // Fórmula para calcular el IMC
        double imc = peso / (altura * altura);

        return imc;
    }
}