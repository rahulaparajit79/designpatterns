package com.example.strategypattern.service;

public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<< Silence >>");
  }
}
