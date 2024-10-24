package model;

/**
 * Esta interfaz representa un reproductor de música.
 */

public interface IMusicPlayer {

    /**
     *  Reproduce una canción dada su nombre de archivo.
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    void playSong(String fileName);

}
