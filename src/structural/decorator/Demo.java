package structural.decorator;

import structural.decorator.abstractcomponents.Beverage;
import structural.decorator.concretecomponents.Espresso;
import structural.decorator.concretecomponents.Mocha;
import structural.decorator.concretedecorators.CaramelAddon;
import structural.decorator.concretedecorators.SoyAddon;

public class Demo {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println("price of plain espresso is " + espresso.getCost() + "$.");

        Beverage espressoWithCaramelAddon = new CaramelAddon(espresso);
        System.out.println("price of espresso with caramel is " + espressoWithCaramelAddon.getCost() + "$.");

        Beverage mocha = new Mocha();
        Beverage mochaWithSoyAddon = new SoyAddon(mocha);
        System.out.println("price of mocha with soy is " + mochaWithSoyAddon.getCost() + "$.");

        Beverage espressoWithCaramelAndSoyAddons = new SoyAddon(espressoWithCaramelAddon);
        System.out.println("price of espresso with caramel & soy is " + espressoWithCaramelAndSoyAddons.getCost() + "$.");
    }
}
