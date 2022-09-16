package structural.decorator.concretedecorators;

import structural.decorator.abstractcomponents.Beverage;
import structural.decorator.constants.Price;

public class SoyAddon extends Beverage {
    private final Beverage beverage;

    public SoyAddon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return Price.soyAddon + beverage.getCost();
    }
}
