package model;

/**
 * Clase que implementa la interfaz IMusicPlayer y se encarga de adaptar la interfaz de ThirdPartyAudioPlayer
 */
public class AdapterAudioPlayer implements IMusicPlayer {

    /**
     * Atributo que representa el reproductor de audio de terceros.
     */
    private ThirdPartyAudioPlayer thirdPartyAudioPlayer = new ThirdPartyAudioPlayer();
    
    /**
     * Constructor de la clase AdapterAudioPlayer.
     * @param thirdPartyAudioPlayer El reproductor de audio de terceros que se adaptará.
     */
    public AdapterAudioPlayer(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }


    /**
     * Reproduce una canción dada su nombre de archivo.
     * @param file El nombre del archivo de la canción a reproducir.
     */
    
    @Override
    public void playSong(String file){
        thirdPartyAudioPlayer.startAudio(file);
    }
    

}
