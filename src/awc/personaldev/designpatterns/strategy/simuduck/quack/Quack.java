package awc.personaldev.designpatterns.strategy.simuduck.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }
}
