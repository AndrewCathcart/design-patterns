package awc.personaldev.designpatterns.strategy.simuduck.duck;

import awc.personaldev.designpatterns.strategy.simuduck.fly.FlyNoWay;
import awc.personaldev.designpatterns.strategy.simuduck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck.");
    }
}
