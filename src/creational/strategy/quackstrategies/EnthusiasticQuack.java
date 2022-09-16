package creational.strategy.quackstrategies;

import creational.strategy.interfaces.IQuackStrategy;

public class EnthusiasticQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("Quack Quack, Life is Awesome!!");
    }
}
