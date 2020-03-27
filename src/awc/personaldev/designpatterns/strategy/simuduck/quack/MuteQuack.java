package awc.personaldev.designpatterns.strategy.simuduck.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("*nothing*");
    }
}
