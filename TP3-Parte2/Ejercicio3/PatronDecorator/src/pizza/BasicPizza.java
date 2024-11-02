package pizza;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza básica";
    }

    @Override
    public double cost() {
        return 5.00; // Precio base de la pizza
    }
}
