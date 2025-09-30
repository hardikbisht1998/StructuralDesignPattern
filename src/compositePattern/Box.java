package compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Container {

    private final String name;
    private final List<Container> children = new ArrayList<>();


    public void add(Container c) {
        children.add(c);
    }

    public void remove(Container c) {
        children.remove(c);
    }


    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public int analysePrice() {
        System.out.println(this.getName() + " Box is Opened ");
        int sum = 0;
        for (Container c : children) {
            sum += c.analysePrice();
        }
        // If needed, add packaging surcharge here (domain rule)
        return sum;

    }
}
