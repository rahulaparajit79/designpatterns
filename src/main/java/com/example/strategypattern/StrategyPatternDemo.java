package com.example.strategypattern;

import com.example.strategypattern.service.Duck;
import com.example.strategypattern.service.FlyRocketPowered;
import com.example.strategypattern.service.MallardDuck;
import com.example.strategypattern.service.ModelDuck;

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
