package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un directorio en el sistema de archivos.
 * Puede contener una lista de componentes del sistema de archivos,
 * que pueden ser archivos o subdirectorios.
*/ 
public class Directory extends FileSystemComponent{
    private List<FileSystemComponent> components = new ArrayList<>();

    /**
     * Constructor de la clase Directory.
     * 
     * @param name Nombre del directorio.
    */
    public Directory(String name) {
        super(name);
    }

    /**
     * Agrega un componente al directorio.
     * 
     * @param component Componente a agregar (puede ser un archivo o un directorio).
    */
    public void addComponent(FileSystemComponent component) {
        components.add(component);

    }

    /**
     * Elimina un componente del directorio.
     * 
     * @param component Componente a eliminar (puede ser un archivo o un directorio).
    */
    public void removeComponent(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void showDetails() {
        System.out.println("Directory: " + this.name);
        for (FileSystemComponent component : components) {
            component.showDetails();
        }
        
    }

}
