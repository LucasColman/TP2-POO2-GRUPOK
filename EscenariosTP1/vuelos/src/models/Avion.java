package models;

/**
 * Clase que representa un avión en el sistema
 */
public class Avion {
    private String modelo;
    private int capacidadMaxima;
    
    /**
     * Constructor por defecto
     */
    public Avion() {
    }

    /**
     * Constructor con parámetros
     * @param modelo Modelo del avión
     * @param capacidadMaxima Capacidad máxima del avión
     */
    public Avion(String modelo, int capacidadMaxima) {
        this.modelo = modelo;
        this.capacidadMaxima = capacidadMaxima;
    }

    /** 
     * @return String
     */
    public String getModelo() {
        return modelo;
    }

    /** 
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /** 
     * @return int
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /** 
     * @param capacidadMaxima
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Avion [modelo=" + modelo + ", capacidadMaxima=" + capacidadMaxima + ", getModelo()=" + getModelo()
                + ", getCapacidadMaxima()=" + getCapacidadMaxima() + ", getClass()=" + getClass() + ", hashCode()="
                + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
