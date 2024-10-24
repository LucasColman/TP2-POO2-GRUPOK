package model;

/*
 * Esta clase representa una aplicación de música que puede reproducir canciones
 */
public class MusicApp{

    /**
     * Atributo que representa el reproductor de música.
     */
    private IMusicPlayer musicPlayer;

    
   /**
     * Constructor de la clase MusicApp.
     *
     * @param musicPlayer El reproductor de música que se utilizará para reproducir canciones.
     */
    public MusicApp(IMusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    /**
     * Reproduce una canción dada su nombre de archivo.
     *
     * @param fileName El nombre del archivo de la canción a reproducir.
     */
    public void playSong(String fileName){
        musicPlayer.playSong(fileName);
    }

}
