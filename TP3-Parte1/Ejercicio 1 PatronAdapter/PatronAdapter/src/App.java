
/* 
Ejercicio 1: Patrón Adapter 
Enunciado: 
Tienes una aplicación que permite a los usuarios gestionar sus listas de reproducción de 
música. Actualmente, la aplicación utiliza una interfaz MusicPlayer para reproducir canciones, 
pero ahora te piden integrar un servicio externo llamado ThirdPartyAudioPlayer que tiene una 
interfaz diferente para reproducir pistas de audio. 

Tareas: 
    1. Implementa un adaptador que permita que ThirdPartyAudioPlayer funcione con la interfaz MusicPlayer existente. 
    2. Crea una clase MusicApp que utilice tu adaptador para reproducir canciones desde ambos reproductores. 

Requisitos: 
     La interfaz MusicPlayer debe tener un método playSong(String fileName). 
     La clase ThirdPartyAudioPlayer tiene un método startAudio(String file). 
     Usa el patrón Adapter para integrar ambos sistemas sin modificar la clase ThirdPartyAudioPlayer. 

Puntos clave a evaluar: 
     Aplicación correcta del patrón Adapter. 
     Correcta implementación del adaptador para traducir las interfaces. 
     Diagrama de clases bien estructurado. 
 */

import model.AdapterAudioPlayer;
import model.IMusicPlayer;
import model.MusicApp;
import model.ThirdPartyAudioPlayer;

 

/**
 * Clase principal de la aplicación.
 */
public class App {

    /**
     * Método principal que ejecuta la aplicación.
     *
     * @param args Los argumentos de la línea de comandos.
     * @throws Exception Si ocurre una excepción durante la ejecución.
     */
    public static void main(String[] args) throws Exception {

        // Reproductor de música nativo
        IMusicPlayer nativePlayer = new IMusicPlayer() {
            @Override
            public void playSong(String fileName) {
                System.out.println("Reproduciendo audio desde MusicPlayer nativo: " + fileName);
            }
        };
        
         // Usando el reproductor externo a través del adaptador
         ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer();

         // Adaptador para el reproductor de música de terceros
         IMusicPlayer adaptedPlayer = new AdapterAudioPlayer(thirdPartyAudioPlayer);
 
         // Probamos la aplicación con el reproductor nativo
         MusicApp appWithNativePlayer = new MusicApp(nativePlayer);
 
         // Probamos la aplicación con el reproductor adaptado
         MusicApp appWithAdaptedPlayer = new MusicApp(adaptedPlayer);
 
         // Reproduciendo una canción con el reproductor nativo
         appWithNativePlayer.playSong("cancion1.mp3");
 
         // Reproduciendo una canción con el reproductor adaptado
         appWithAdaptedPlayer.playSong("cancion2.wav");
    }
}
