package models;

import java.util.Date;

/**
 * Clase que representa una reserva en el sistema
 */
public class Reserva {
    private int numConfirmacion;
    private Date fechaReserva;
    private String asientoAsignado;

    /**
     * Constructor por defecto
     */
    public Reserva() {
    }

    /**
     * Constructor con parámetros
     * @param numConfirmacion Número de confirmación
     * @param fechaReserva Fecha de la reserva
     * @param asientoAsignado Asiento asignado
     */
    public Reserva(int numConfirmacion, Date fechaReserva, String asientoAsignado) {
        this.numConfirmacion = numConfirmacion;
        this.fechaReserva = fechaReserva;
        this.asientoAsignado = asientoAsignado;
    }

    /** 
     * @return int
     */
    public int getNumConfirmacion() {
        return numConfirmacion;
    }

    /** 
     * @param numConfirmacion
     */
    public void setNumConfirmacion(int numConfirmacion) {
        this.numConfirmacion = numConfirmacion;
    }

    /** 
     * @return Date
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /** 
     * @param fechaReserva
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /** 
     * @return String
     */
    public String getAsientoAsignado() {
        return asientoAsignado;
    }

    /** 
     * @param asientoAsignado
     */
    public void setAsientoAsignado(String asientoAsignado) {
        this.asientoAsignado = asientoAsignado;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "Reserva [numConfirmacion=" + numConfirmacion + ", fechaReserva=" + fechaReserva + ", asientoAsignado="
                + asientoAsignado + ", getNumConfirmacion()=" + getNumConfirmacion() + ", getFechaReserva()="
                + getFechaReserva() + ", getAsientoAsignado()=" + getAsientoAsignado() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }    
}   
