/* 
Ejercicio 2: Patrón Composite 

Enunciado: 
Tienes que diseñar un sistema de gestión de archivos y directorios, donde tanto los archivos 
como los directorios deben ser tratados de manera uniforme. Los directorios pueden 
contener tanto archivos como otros directorios. 

Tareas: 
    1. Crea una clase base abstracta FileSystemComponent con un método showDetails(). 
    2. Crea las clases File y Directory que hereden de FileSystemComponent. Los objetos de la clase Directory pueden contener tanto archivos como otros directorios. 
    3. Implementa una función en la clase Directory para agregar y eliminar componentes (archivos o directorios). 
    4. Implementa un cliente que permita crear una estructura jerárquica de directorios y archivos, y que muestre los detalles de esta estructura. 

Requisitos: 
     La clase File debe tener un nombre y su tamaño en bytes. 
     La clase Directory debe poder contener una lista de objetos FileSystemComponent. 
     El método showDetails() debe imprimir el nombre del archivo o directorio, y en el caso de los directorios, debe listar su contenido de manera recursiva. 

Puntos clave a evaluar: 
     Correcta aplicación del patrón Composite. 
     Implementación de la recursividad para mostrar los detalles de los directorios y sus contenidos. 
     Diagrama de clases que refleje la jerarquía de objetos compuestos.  */

import models.Directory;
import models.File;
/**
 * Clase principal que actúa como cliente para crear una estructura jerárquica
 * de directorios y archivos, y mostrar los detalles de esta estructura.
 */
public class App {
    /**
     * Método principal que crea la estructura de archivos y directorios,
     * y muestra los detalles de la misma.
     * 
     * @param args Argumentos de la línea de comandos.
     * @throws Exception Si ocurre algún error durante la ejecución.
     */
    public static void main(String[] args) throws Exception {
        // Crear archivos
        File file1 = new File("file1.txt", 100);
        File file2 = new File("file2.txt", 200);

        // Crear directorios
        Directory dir1 = new Directory("dir1");
        Directory dir2 = new Directory("dir2");

        // Agregar archivos y directorios a dir1
        dir1.addComponent(file1);
        dir1.addComponent(dir2);

        // Agregar archivo a dir2
        dir2.addComponent(file2);

        // Mostrar detalles de la estructura
        dir1.showDetails();
    }
}
