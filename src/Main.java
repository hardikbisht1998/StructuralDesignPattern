import adapterPattern.AdapterTester;
import compositePattern.CompositeTester;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        AdapterTester adapterTester=new AdapterTester();
//        adapterTester.check();

        CompositeTester compositeTester=new CompositeTester();
        compositeTester.check();
    }
}