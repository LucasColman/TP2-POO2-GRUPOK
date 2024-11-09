import models.LoggerClass;

/**
 * La clase App simula múltiples procesos que intentan escribir en el archivo de log desde diferentes lugares.
 * Utiliza la clase LoggerClass para registrar mensajes de error, advertencia e información.
 */
public class App {
    //Patrón Singleton – Sistema de Logging
    /*
        Enunciado: Estás desarrollando un sistema de logging para una aplicación que registra
        todos los eventos importantes. Debes garantizar que solo exista una única instancia de la
        clase Logger a lo largo de la aplicación para asegurar que todos los eventos se registren en
        un único archivo de log. Esta clase debe ser accesible desde cualquier parte del programa.
    */

    /**
     * Método principal que simula múltiples procesos escribiendo en el archivo de log.
     *
     * @param args los argumentos de la línea de comandos
     * @throws Exception si ocurre un error durante la ejecución
     */
    public static void main(String[] args) throws Exception {
        LoggerClass logger = LoggerClass.getInstancia();

        Thread proceso1 = new Thread(() -> {
            logger.logInfo("Proceso 1 - Información");
            logger.logAdvertencia("Proceso 1 - Advertencia");
            logger.logError("Proceso 1 - Error");
        });

        Thread proceso2 = new Thread(() -> {
            logger.logInfo("Proceso 2 - Información");
            logger.logAdvertencia("Proceso 2 - Advertencia");
            logger.logError("Proceso 2 - Error");
        });

        Thread proceso3 = new Thread(() -> {
            logger.logInfo("Proceso 3 - Información");
            logger.logAdvertencia("Proceso 3 - Advertencia");
            logger.logError("Proceso 3 - Error");
        });

        proceso1.start();
        proceso2.start();
        proceso3.start();

        try {
            proceso1.join();
            proceso2.join();
            proceso3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
