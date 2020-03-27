package awc.personaldev.designpatterns.strategy.simuduck;

import awc.personaldev.designpatterns.strategy.simuduck.duck.Duck;
import awc.personaldev.designpatterns.strategy.simuduck.duck.MallardDuck;
import awc.personaldev.designpatterns.strategy.simuduck.duck.ModelDuck;
import awc.personaldev.designpatterns.strategy.simuduck.fly.FLyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.setFlyBehaviour(new FLyRocketPowered());
        model.performFly();
    }
}
