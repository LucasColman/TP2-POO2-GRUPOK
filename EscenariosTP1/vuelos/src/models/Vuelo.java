package models;

import java.sql.Time;
import java.util.Date;

/**
 * Clase que representa un vuelo en el sistema
 */

public class Vuelo {
    private int numVuelo;
    private Date fechaSalida;
    private Time horaSalida;
    private Date fechaLlegada;
    private Time horaLlegada;
    
    /**
     * Constructor por defecto
     */
    public Vuelo() {
    }

    /**
     * Constructor con parámetros
     * @param numVuelo Número de vuelo
     * @param fechaSalida Fecha de salida
     * @param horaSalida Hora de salida
     * @param fechaLlegada Fecha de llegada
     * @param horaLlegada Hora de llegada
     */
    public Vuelo(int numVuelo, Date fechaSalida, Time horaSalida, Date fechaLlegada, Time horaLlegada) {
        this.numVuelo = numVuelo;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.fechaLlegada = fechaLlegada;
        this.horaLlegada = horaLlegada;
    }
    
    /** 
     * @return int
     */
    public int getNumVuelo() {
        return numVuelo;
    }

    /** 
     * @param numVuelo
     */
    public void setNumVuelo(int numVuelo) {
        this.numVuelo = numVuelo;
    }

    /** 
     * @return Date
     */
    public Date getFechaSalida() {
        return fechaSalida;
    }

    /** 
     * @param fechaSalida
     */
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /** 
     * @return Time
     */
    public Time getHoraSalida() {
        return horaSalida;
    }

    /** 
     * @param horaSalida
     */
    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    /** 
     * @return Date
     */
    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    /** 
     * @param fechaLlegada
     */
    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    /** 
     * @return Time
     */
    public Time getHoraLlegada() {
        return horaLlegada;
    }

    /** 
     * @param horaLlegada
     */
    public void setHoraLlegada(Time horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    /**
     * Método toString
     * @return String
     */
    @Override
    public String toString() {
        return "Vuelo [numVuelo=" + numVuelo + ", fechaSalida=" + fechaSalida + ", horaSalida=" + horaSalida
                + ", fechaLlegada=" + fechaLlegada + ", horaLlegada=" + horaLlegada + ", getNumVuelo()=" + getNumVuelo()
                + ", getFechaSalida()=" + getFechaSalida() + ", getHoraSalida()=" + getHoraSalida()
                + ", getFechaLlegada()=" + getFechaLlegada() + ", getHoraLlegada()=" + getHoraLlegada()
                + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
                + "]";
    }

    
}
