package pizza;

public class MushroomDecorator extends ToppingDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", champiñones";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.75; // Precio adicional por champiñones
    }
}
