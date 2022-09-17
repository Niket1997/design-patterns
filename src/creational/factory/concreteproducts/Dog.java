package creational.factory.concreteproducts;

import creational.factory.product.Animal;

public class Dog extends Animal {
    private boolean isCute = false;

    public Dog(String name) {
        super(name);
    }

    public void makeCute() {
        isCute = true;
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm " + super.getName() + " the Dog.");
        if (isCute) System.out.println("I'm cute!");
        System.out.println("You know you love me!");
    }
}
