package structural.decorator.concretedecorators;

import structural.decorator.abstractcomponents.Beverage;
import structural.decorator.constants.Price;

public class CaramelAddon extends Beverage {
    private final Beverage beverage;

    public CaramelAddon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return Price.caramelAddon + beverage.getCost();
    }
}
