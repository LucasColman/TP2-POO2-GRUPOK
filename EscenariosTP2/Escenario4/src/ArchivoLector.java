import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoLector {
     
    /**
     * Lee el contenido de un archivo y lo imprime en la consola.
     *
     * @param rutaArchivo La ruta del archivo que se desea leer.
     * @throws FileNotFoundException Si el archivo no se encuentra en la ruta especificada.
     * @throws IOException Si ocurre un error de entrada/salida al leer el archivo.
     */
    
    public void leerArchivo(String rutaArchivo) throws FileNotFoundException, IOException {
        BufferedReader lector = null;
        try {
            lector = new BufferedReader(new FileReader(rutaArchivo)); // Abre el archivo para lectura
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Error: El archivo no se encontró en la ruta especificada.");
            throw e; // Propaga la excepción para que pueda ser manejada externamente
        } catch (IOException e) {
            System.err.println("Error: Ocurrió un problema al leer el archivo.");
            throw e; // Propaga la excepción para que pueda ser manejada externamente
        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    System.err.println("Error: No se pudo cerrar el lector.");
                }
            }
        }
    }

   

}
