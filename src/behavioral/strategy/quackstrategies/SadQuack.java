package behavioral.strategy.quackstrategies;

import behavioral.strategy.interfaces.IQuackStrategy;

public class SadQuack implements IQuackStrategy {
    @Override
    public void quack() {
        System.out.println("Quack Quack, Life is so sad!!");
    }
}
