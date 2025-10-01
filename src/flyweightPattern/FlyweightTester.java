package flyweightPattern;

import java.awt.*;
import java.util.Random;


public class FlyweightTester {

    int size = 1000;
    int TREES_TO_DRAW = 200000;

    public void check() {

        Forest forest = new Forest();
        Random random = new Random();
        for (int i = 0; i < TREES_TO_DRAW; i++) {

            forest.plantTree(random.nextInt(size + 1), random.nextInt(size + 1), "soot", Color.GREEN, "generic");
            forest.plantTree(random.nextInt(size + 1), random.nextInt(size + 1), "hoot", Color.GRAY, "generic2");
//


        }
        forest.setSize(size, size);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + 2 + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + 2 * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }
}
