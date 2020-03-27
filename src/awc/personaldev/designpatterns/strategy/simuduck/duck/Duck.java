package awc.personaldev.designpatterns.strategy.simuduck.duck;

import awc.personaldev.designpatterns.strategy.simuduck.fly.FlyBehaviour;
import awc.personaldev.designpatterns.strategy.simuduck.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim, even decoys!");
    }
}
