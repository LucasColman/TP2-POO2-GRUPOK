package modelos;

import java.time.LocalDate;



/**
 * Clase que representa un Préstamo con información sobre la fecha del préstamo y la fecha de devolución.
 */
public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    /**
     * Constructor vacío de la clase Prestamo.
     */
    public Prestamo() {
    }

    /**
     * Constructor de la clase Prestamo con parámetros.
     * 
     * @param fechaPrestamo   La fecha en la que se realizó el préstamo.
     * @param fechaDevolucion La fecha en la que se debe devolver el préstamo.
     */

    public Prestamo(LocalDate fechaPrestamo, LocalDate fechaDevolucion) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Obtiene la fecha en la que se realizó el préstamo.
     * 
     * @return La fecha del préstamo.
     */
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    /**
     * Establece la fecha en la que se realizó el préstamo.
     * 
     * @param fechaPrestamo La nueva fecha del préstamo.
     */
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    /**
     * Obtiene la fecha en la que se debe devolver el préstamo.
     * 
     * @return La fecha de devolución del préstamo.
     */
    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * Establece la fecha en la que se debe devolver el préstamo.
     * 
     * @param fechaDevolucion La nueva fecha de devolución del préstamo.
     */
    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * Método para registrar un nuevo préstamo. Imprime un mensaje indicando que se ha realizado un nuevo préstamo.
     */
    public void nuevoPrestamo() {
        System.out.println("Nuevo prestamo");
    }

    /**
     * Devuelve una representación en cadena del préstamo, que incluye la fecha del préstamo y la fecha de devolución.
     * 
     * @return Una cadena con la información del préstamo.
     */
    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion + "]";
    }

}

