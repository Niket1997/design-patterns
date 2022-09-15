package creational.strategy.flyStrategies;

import creational.strategy.interfaces.IFlyStrategy;

public class MountainFly implements IFlyStrategy {
    @Override
    public void fly() {
        System.out.println("I'm flying over mountains!!");
    }
}
