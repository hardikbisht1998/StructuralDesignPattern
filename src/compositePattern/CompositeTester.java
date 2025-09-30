package compositePattern;

public class CompositeTester {

    public void check() {
        Wrapper wrapper = new Wrapper(300, "teedy");
        Wrapper wrapper1 = new Wrapper(100, "Chocolate");
        Box box = new Box("b1");
        Box box1 = new Box("b2");
        Wrapper wrapper2 = new Wrapper(600, "Barbie");
        box1.add(wrapper);
        box1.add(wrapper2);
        box.add(wrapper1);
        box.add(box1);


        System.out.println("Price of the box is :" + box.analysePrice());
    }
}
