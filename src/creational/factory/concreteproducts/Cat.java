package creational.factory.concreteproducts;

import creational.factory.product.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("I'm " + super.getName() + " the cat.");
        System.out.println("You know I'm mean, still you love me!");
    }
}
