package structural.decorator.abstractdecorators;

import structural.decorator.abstractcomponents.Beverage;

public abstract class AddonDecorator extends Beverage {
    public abstract int getCost();
}
