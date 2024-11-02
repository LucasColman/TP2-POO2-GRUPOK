/*
1. Patrón State - Gestión de Semáforos 

Enunciado: Imagina que trabajas en el desarrollo de un sistema de control de tráfico. Un 
semáforo puede tener tres estados: Rojo, Amarillo, y Verde. El comportamiento del 
semáforo cambia dependiendo de su estado actual (por ejemplo, cuando está en rojo, los 
autos deben detenerse; cuando está en verde, pueden avanzar). 

Tareas: 
     Implementa el patrón State para modelar los diferentes estados del semáforo. 
     El sistema debe poder cambiar entre los diferentes estados de manera controlada. 
     Incluir un diagrama UML y el código en Java que represente la solución.
 */

import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        SemaforoContext semaforo = new SemaforoContext();

        // Cambiar de estado 6 veces
        for (int i = 0; i < 6; i++) {
            semaforo.cambiarEstado();
        }
    }
}
