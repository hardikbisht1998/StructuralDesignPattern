package proxyPattern;

public class Gold implements Asset {
    private int weight;
    private int purity;

    public Gold(int weight, int purity) {
        this.weight = weight;
        this.purity = purity;
    }

    @Override
    public void evaluate() {

        System.out.println("Gold of Purity " + purity + " and weight " + weight + " present here ");
    }
}
