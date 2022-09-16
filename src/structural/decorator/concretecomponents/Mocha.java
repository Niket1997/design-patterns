package structural.decorator.concretecomponents;

import structural.decorator.abstractcomponents.Beverage;
import structural.decorator.constants.Price;

public class Mocha extends Beverage {
    @Override
    public int getCost() {
        return Price.mocha;
    }
}
