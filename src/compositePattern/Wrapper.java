package compositePattern;

public class Wrapper implements Container {

    private final String name;
    private final int price;


    public Wrapper(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }


    @Override
    public int analysePrice() {
        System.out.println(this.getName() + " Wrapper is Opened ");
        return price;
    }
}
