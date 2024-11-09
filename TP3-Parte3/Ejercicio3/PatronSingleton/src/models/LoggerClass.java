package models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * La clase LoggerClass implementa el patrón Singleton para asegurar que solo exista una única instancia
 * de Logger a lo largo de la aplicación. Permite registrar mensajes de error, advertencia e información
 * en un archivo de log.
*/
public class LoggerClass {
    private static LoggerClass instancia;
    private PrintWriter escritor;

    /**
     * Constructor privado de la clase LoggerClass.
     * Inicializa el PrintWriter para escribir en el archivo de log.
    */
    private LoggerClass() {
        try {
            FileWriter archivo = new FileWriter("log.txt", true);
            escritor = new PrintWriter(archivo, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Devuelve la única instancia de LoggerClass.
     * Si no existe, la crea.
     *
     * @return la instancia única de LoggerClass
     */
    public static synchronized LoggerClass getInstancia() {
        if (instancia == null) {
            instancia = new LoggerClass();
        }
        return instancia;
    }

    /**
     * Registra un mensaje de información en el archivo de log.
     *
     * @param mensaje el mensaje de información a registrar
     */
    public void logInfo(String mensaje) {
        escritor.println("INFO: " + mensaje);
    }

    /**
     * Registra un mensaje de advertencia en el archivo de log.
     *
     * @param mensaje el mensaje de advertencia a registrar
     */
    public void logAdvertencia(String mensaje) {
        escritor.println("ADVERTENCIA: " + mensaje);
    }

    /**
     * Registra un mensaje de error en el archivo de log.
     *
     * @param mensaje el mensaje de error a registrar
     */
    public void logError(String mensaje) {
        escritor.println("ERROR: " + mensaje);
}
}
