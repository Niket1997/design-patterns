package behavioral.strategy;

import behavioral.strategy.interfaces.IFlyStrategy;
import behavioral.strategy.interfaces.IQuackStrategy;

public class Duck {
    private final String name;
    private final IFlyStrategy flyStrategy;
    private final IQuackStrategy quackStrategy;

    public Duck(String name, IFlyStrategy flyStrategy, IQuackStrategy quackStrategy) {
        this.name = name;
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }

    public void display() {
        System.out.println("I'm " + name);
    }

    public void fly() {
        flyStrategy.fly();
    }

    public void quack() {
        quackStrategy.quack();
    }
}
