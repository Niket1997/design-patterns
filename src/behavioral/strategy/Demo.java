package behavioral.strategy;

import behavioral.strategy.flystrategies.MountainFly;
import behavioral.strategy.flystrategies.OceanFly;
import behavioral.strategy.interfaces.IFlyStrategy;
import behavioral.strategy.interfaces.IQuackStrategy;
import behavioral.strategy.quackstrategies.EnthusiasticQuack;
import behavioral.strategy.quackstrategies.SadQuack;

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
