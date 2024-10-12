import java.io.FileNotFoundException;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        ArchivoLector lector = new ArchivoLector();
        try {
            lector.leerArchivo("ruta/del/archivo.txt");
        } catch (FileNotFoundException e) {
            System.err.println("Excepción capturada: Archivo no encontrado.");
        } catch (IOException e) {
            System.err.println("Excepción capturada: Error de entrada/salida.");
        }
    }
}
