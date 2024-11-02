package pizza;

public class CheeseDecorator extends ToppingDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", queso extra";
    }

    @Override
    public double cost() {
        return pizza.cost() + 1.50; // Precio adicional por queso extra
    }
}
