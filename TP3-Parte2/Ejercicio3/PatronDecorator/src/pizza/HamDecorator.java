package pizza;

public class HamDecorator extends ToppingDecorator {
    public HamDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", jamón";
    }

    @Override
    public double cost() {
        return pizza.cost() + 2.00; // Precio adicional por jamón
    }
}
