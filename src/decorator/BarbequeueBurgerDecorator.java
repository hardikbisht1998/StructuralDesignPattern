package decorator;

public class BarbequeueBurgerDecorator extends BurgerDecorator {

    public BarbequeueBurgerDecorator(Burger burger) {
        super(burger);
    }

    @Override
    public void makeBurger() {
        burger.makeBurger();
        System.out.println(" Vegetable and Cheese added to it ...");
    }
}
