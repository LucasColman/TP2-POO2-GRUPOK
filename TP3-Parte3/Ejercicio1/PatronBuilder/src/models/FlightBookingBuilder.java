package models;

/**
 * Clase constructora (Builder) para crear instancias de FlightBooking.
 */
public class FlightBookingBuilder {
    String seatSelection;
    int baggageCount;
    String mealType;
    boolean premiumServices;

    /**
     * Configura la selección de asiento en la reserva.
     */
    public FlightBookingBuilder setSeatSelection(String seatSelection) {
        this.seatSelection = seatSelection;
        return this;
    }

    /**
     * Configura la cantidad de equipaje en la reserva.
     */
    public FlightBookingBuilder setBaggageCount(int baggageCount) {
        this.baggageCount = baggageCount;
        return this;
    }

    /**
     * Configura el tipo de comida en la reserva.
     */
    public FlightBookingBuilder setMealType(String mealType) {
        this.mealType = mealType;
        return this;
    }

    /**
     * Activa o desactiva los servicios premium en la reserva.
     */
    public FlightBookingBuilder setPremiumServices(boolean premiumServices) {
        this.premiumServices = premiumServices;
        return this;
    }

    /**
     * Construye y retorna una instancia de FlightBooking con las configuraciones especificadas.
     */
    public FlightBooking build() {
        return new FlightBooking(this);
    }
}
