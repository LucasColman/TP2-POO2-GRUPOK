package pizza;

public class App {
    public static void main(String[] args) {
        // Crear una pizza básica
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        // Añadir ingredientes
        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new HamDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription() + " $" + pizza.cost());
    }
}

