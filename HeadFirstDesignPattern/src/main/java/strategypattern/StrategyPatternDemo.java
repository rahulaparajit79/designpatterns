package strategypattern;

import strategypattern.service.Duck;
import strategypattern.service.FlyRocketPowered;
import strategypattern.service.MallardDuck;
import strategypattern.service.ModelDuck;

public class StrategyPatternDemo {
  public static void main(String[] args) {
    System.out.println("Strategy Pattern");
    Duck mallardDuck = new MallardDuck();
    mallardDuck.display();
    mallardDuck.performQuack();
    mallardDuck.performFly();

    Duck modelDock = new ModelDuck();
    modelDock.display();
    modelDock.performFly();
    modelDock.setFlyBehavior(new FlyRocketPowered());
    modelDock.performFly();
  }
}
