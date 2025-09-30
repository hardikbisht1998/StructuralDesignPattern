package bridgePattern;

public class Ryuk extends Template {
    @Override
    public void designWall() {
        System.out.println(" Designing the wall with ryuk wall art ..");
        if (color != null) {
            color.pickColor();
        }
    }
}
