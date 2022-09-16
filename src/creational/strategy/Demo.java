package creational.strategy;

import creational.strategy.flystrategies.MountainFly;
import creational.strategy.flystrategies.OceanFly;
import creational.strategy.interfaces.IFlyStrategy;
import creational.strategy.interfaces.IQuackStrategy;
import creational.strategy.quackstrategies.EnthusiasticQuack;
import creational.strategy.quackstrategies.SadQuack;

public class Demo {
    public static void main(String[] args) {
        // create awesome duck
        IFlyStrategy mountainFly = new MountainFly();
        IQuackStrategy enthusiasticQuack = new EnthusiasticQuack();
        Duck awesomeDuck = new Duck("Donald", mountainFly, enthusiasticQuack);
        awesomeDuck.display();
        awesomeDuck.fly();
        awesomeDuck.quack();

        // create sad duck
        IFlyStrategy oceanFly = new OceanFly();
        IQuackStrategy sadQuack = new SadQuack();
        Duck sadDuck = new Duck("Trump", oceanFly, sadQuack);
        sadDuck.display();
        sadDuck.fly();
        sadDuck.quack();
    }
}
