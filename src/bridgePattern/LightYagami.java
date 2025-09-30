package bridgePattern;

public class LightYagami extends Template {
    @Override
    public void designWall() {
        System.out.println(" Designing the wall with LightYagami wall art ..");
        if (color != null) {
            color.pickColor();
        }
    }
}
