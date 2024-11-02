
/*
 2. Patrón Strategy - Métodos de Envío en una Tienda en Línea 

 Enunciado: Estás desarrollando un sistema para una tienda en línea. Cuando un cliente 
realiza una compra, puede elegir entre diferentes métodos de envío: Envío Regular, Envío 
Expreso o Envío Internacional. Cada método tiene un costo y una estrategia de entrega 
diferente. 

Tareas: 
     Implementa el patrón Strategy para manejar los diferentes métodos de envío. 
     El sistema debe permitir cambiar fácilmente entre las diferentes estrategias de envío. 
     Incluir un diagrama UML y el código en Java que represente la solución. 

 */

import models.Cliente;
import models.EnvioExpreso;
import models.EnvioInternacional;
import models.EnvioRegular;

public class App {
    /**
    * Método principal para probar las diferentes estrategias de envío.
    * @param args argumentos de la línea de comandos.
    */    
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();

        cliente.setEstrategia(new EnvioRegular());
        System.out.println("Costo de Envío Regular: " + cliente.calcularCosto());

        cliente.setEstrategia(new EnvioExpreso());
        System.out.println("Costo de Envío Expreso: " + cliente.calcularCosto());

        cliente.setEstrategia(new EnvioInternacional());
        System.out.println("Costo de Envío Internacional: " + cliente.calcularCosto());
    }
}
