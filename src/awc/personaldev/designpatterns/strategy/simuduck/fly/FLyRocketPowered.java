package awc.personaldev.designpatterns.strategy.simuduck.fly;

public class FLyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
