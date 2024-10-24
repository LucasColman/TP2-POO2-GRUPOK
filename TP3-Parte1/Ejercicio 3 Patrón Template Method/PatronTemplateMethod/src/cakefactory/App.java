
/* 
 Ejercicio 3: Patrón Template Method 

 Enunciado: 
Debes desarrollar un sistema que gestione el proceso de fabricación de diferentes tipos de 
pasteles. El proceso general para hacer un pastel incluye: preparar los ingredientes, 
hornear, decorar y empaquetar. Sin embargo, los detalles de cada paso varían según el tipo 
de pastel (por ejemplo, pastel de chocolate, pastel de vainilla). 

Tareas: 
    1. Crea una clase abstracta Cake que defina el método makeCake(), que incluye los pasos generales para hacer un pastel. 
    2. Define métodos abstractos para los pasos que varían entre los diferentes tipos de pasteles (por ejemplo, prepareIngredients(), decorateCake()). 
    3. Crea subclases como ChocolateCake y VanillaCake que implementen los detalles específicos de estos pasos. 
    4. Implementa un cliente que cree diferentes tipos de pasteles y los fabrique usando el método makeCake(). 

Requisitos: 
     La clase Cake debe tener el método makeCake(), que no debe ser modificado por las subclases. 
     Los pasos como prepareIngredients() y decorateCake() deben ser implementados en las subclases. 
     El cliente debe ser capaz de crear tanto un pastel de chocolate como un pastel de vainilla y procesarlos utilizando el mismo flujo de fabricación. 

Puntos clave a evaluar: 
     Correcta aplicación del patrón Template Method. 
     Implementación clara de las variaciones en los pasos del algoritmo entre los diferentes tipos de pasteles. 
     Diagrama de clases que ilustre la estructura jerárquica y los métodos.
 */


 package cakefactory;

 /**
  * La clase principal que actúa como cliente en el patrón Template Method.
  * Crea instancias de diferentes tipos de pasteles y llama al método makeCake()
  * para ejecutar el proceso de fabricación.
  */
 public class App {
     public static void main(String[] args) {
         // Creando una instancia de ChocolateCake y VanillaCake
         Cake chocolateCake = new ChocolateCake();
         Cake vanillaCake = new VanillaCake();
 
         // Fabricando los pasteles
         System.out.println("Fabricando pastel de chocolate:");
         chocolateCake.makeCake(); // Ejecuta el proceso de fabricación de pastel de chocolate
 
         System.out.println("\nFabricando pastel de vainilla:");
         vanillaCake.makeCake(); // Ejecuta el proceso de fabricación de pastel de vainilla
     }
 }
 