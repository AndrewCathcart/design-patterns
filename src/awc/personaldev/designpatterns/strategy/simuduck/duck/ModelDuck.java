package awc.personaldev.designpatterns.strategy.simuduck.duck;

import awc.personaldev.designpatterns.strategy.simuduck.fly.FlyNoWay;
import awc.personaldev.designpatterns.strategy.simuduck.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck.");
    }
}
