package models;

/**
 * Clase que representa una reserva de vuelo.
 */
public class FlightBooking {
    private String seatSelection;
    private int baggageCount;
    private String mealType;
    private boolean premiumServices;

    // Constructor sin modificador de acceso (package-private)
    FlightBooking(FlightBookingBuilder builder) {
        this.seatSelection = builder.seatSelection;
        this.baggageCount = builder.baggageCount;
        this.mealType = builder.mealType;
        this.premiumServices = builder.premiumServices;
    }

    @Override
    public String toString() {
        return "Reserva de Vuelo: " +
               "Asiento=" + seatSelection +
               ", Equipaje=" + baggageCount +
               ", Comida=" + mealType +
               ", Servicios Premium=" + (premiumServices ? "Sí" : "No");
    }

    // Getters
    public String getSeatSelection() { return seatSelection; }
    public int getBaggageCount() { return baggageCount; }
    public String getMealType() { return mealType; }
    public boolean hasPremiumServices() { return premiumServices; }
}
