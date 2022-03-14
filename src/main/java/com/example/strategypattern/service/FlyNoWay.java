package com.example.strategypattern.service;

public class FlyNoWay implements FlyBehavior {
  @Override
  public void fly() {
    System.out.println("I can't fly");
  }
}
