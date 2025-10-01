package flyweightPattern;

import java.awt.*;

public class Tree {

    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType treeType) {
        this.type = treeType;
        this.x = x;
        this.y = y;
    }


    public void draw(Graphics graphic) {
        type.draw(graphic, x, y);
    }
}
