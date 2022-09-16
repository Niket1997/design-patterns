package structural.decorator;

import structural.decorator.concretecomponents.Espresso;
import structural.decorator.concretecomponents.Mocha;
import structural.decorator.concretedecorators.CaramelAddon;
import structural.decorator.concretedecorators.SoyAddon;

public class Demo {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println("price of plain espresso is " + espresso.getCost() + "$.");

        CaramelAddon espressoWithCaramelAddon = new CaramelAddon(espresso);
        System.out.println("price of espresso with caramel is " + espressoWithCaramelAddon.getCost() + "$.");

        Mocha mocha = new Mocha();
        SoyAddon mochaWithSoyAddon = new SoyAddon(mocha);
        System.out.println("price of mocha with soy is " + mochaWithSoyAddon.getCost() + "$.");

        SoyAddon espressoWithCaramelAndSoyAddons = new SoyAddon(espressoWithCaramelAddon);
        System.out.println("price of espresso with caramel & soy is " + espressoWithCaramelAndSoyAddons.getCost() + "$.");
    }
}
