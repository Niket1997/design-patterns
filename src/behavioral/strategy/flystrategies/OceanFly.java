package behavioral.strategy.flystrategies;

import behavioral.strategy.interfaces.IFlyStrategy;

public class OceanFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("I'm flying over ocean!!");
    }
}
