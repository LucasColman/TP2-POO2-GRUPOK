package models;
/**
 * Clase que representa un archivo en el sistema de archivos.
*/
public class File extends FileSystemComponent{
    private int size;
    
    /**
     * Constructor de la clase File.
     * 
     * @param name Nombre del archivo.
     * @param size Tamaño del archivo en bytes.
    */
    public File(String name, int size) {
        super(name);
        this.size = size;
    }
    
    /**
     * Muestra los detalles del archivo.
     * Imprime el nombre y el tamaño del archivo.
    */
    @Override
    public void showDetails() {
        System.out.println("File: " + name + " (Size: " + size + " bytes)");
    }
}
