import adapterPattern.AdapterTester;
import bridgePattern.BridgeTester;
import compositePattern.CompositeTester;
import decorator.DecoratorTester;
import facade.FacadeTester;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        AdapterTester adapterTester=new AdapterTester();
//        adapterTester.check();

        CompositeTester compositeTester=new CompositeTester();
        compositeTester.check();
        FacadeTester facadeTester=new FacadeTester();
        facadeTester.check();

        DecoratorTester decoratorTester=new DecoratorTester();
        decoratorTester.check();
        BridgeTester bridgeTester=new BridgeTester();
        bridgeTester.check();
    }
}