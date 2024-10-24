package models;
/**
 * Clase abstracta que representa un componente del sistema de archivos.
 * Puede ser un archivo o un directorio.
*/
public abstract class FileSystemComponent {
    protected String name;

    /**
     * Constructor de la clase FileSystemComponent.
     * 
     * @param name Nombre del componente del sistema de archivos.
    */
    public FileSystemComponent(String name) {
        this.name = name;
    }
    /**
     * Método abstracto para mostrar los detalles del componente.
     * Debe ser implementado por las clases derivadas.
    */
    public abstract void showDetails();
}
