package structural.decorator.concretecomponents;

import structural.decorator.abstractcomponents.Beverage;
import structural.decorator.constants.Price;

public class Espresso extends Beverage {
    @Override
    public int getCost() {
        return Price.espresso;
    }
}
