package awc.personaldev.designpatterns.strategy.simuduck.quack;

public class Squeak implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
