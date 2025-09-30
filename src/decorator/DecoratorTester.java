package decorator;

public class DecoratorTester {
    public void check() {
        Burger burger = new PlainBurger();
        Burger cheeseBurger = new CheeseBurgerDecorator(burger);
        Burger bbqCheeseBurger = new BarbequeueBurgerDecorator(cheeseBurger);

        System.out.println("-- Making Plain Burger --");
        burger.makeBurger();

        System.out.println("-- Making Cheese Burger --");
        cheeseBurger.makeBurger();

        System.out.println("-- Making BBQ + Cheese Burger --");
        bbqCheeseBurger.makeBurger();
    }
}
