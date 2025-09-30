package decorator;

public class PlainBurger implements Burger {

    @Override
    public void makeBurger() {
        System.out.println("Plain Burger is readhy");
    }
}
