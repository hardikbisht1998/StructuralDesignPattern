package bridgePattern;

public class BridgeTester {
    public void check() {
        Template art1 = new LightYagami();
        Template art2 = new Ryuk();

        Color red = new Red();
        Color blue = new Blue();
        art1.setColor(blue);
        art2.setColor(red);

        art1.designWall();
        art1.setColor(red);
        art1.designWall();
    }
}
