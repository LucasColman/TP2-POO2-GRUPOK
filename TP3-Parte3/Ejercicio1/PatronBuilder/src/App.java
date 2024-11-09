/**
    Escenario: 
    Patrón Builder - Gestión de Vuelos
    Enunciado: Estás trabajando en un sistema de reservas para vuelos. El sistema debe
    permitir a los usuarios personalizar su experiencia de vuelo agregando opciones como
    selección de asiento, equipaje adicional, comidas especiales y acceso a servicios premium.
    Necesitas implementar una clase FlightBookingBuilder que permita a los usuarios configurar
    su reserva de vuelo con las opciones que deseen y luego construirla.
    Tareas:
     Implementar el patrón Builder para crear una reserva de vuelo con diferentes
    configuraciones, como selección de asiento, equipaje adicional, comidas especiales
    y servicios premium.
     La clase FlightBooking debe tener atributos como: asiento seleccionado, cantidad de
    equipaje, tipo de comida y servicios premium.
     El cliente debe poder crear una reserva de vuelo personalizada utilizando el
    FlightBookingBuilder.
 */

import models.FlightBooking;
import models.FlightBookingBuilder;

/**
 * Clase principal para probar el sistema de reservas de vuelo.
 */
public class App {
    public static void main(String[] args) {
        // Crear una reserva personalizada usando el Builder
        FlightBooking booking = new FlightBookingBuilder()
                                    .setSeatSelection("Ventana")
                                    .setBaggageCount(2)
                                    .setMealType("Vegetariana")
                                    .setPremiumServices(true)
                                    .build();

        // Mostrar detalles de la reserva
        System.out.println(booking);
    }
}
