
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

 public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Ejercicio 1: Patrón Adapter");
    }
}
