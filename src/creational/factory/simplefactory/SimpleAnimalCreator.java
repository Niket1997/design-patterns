package creational.factory.simplefactory;

import creational.factory.concreteproducts.Cat;
import creational.factory.concreteproducts.Dog;
import creational.factory.product.Animal;

public class SimpleAnimalCreator {
    public static Animal createAnimal(String animalType, String name) {
        if (animalType.equals("Dog")) {
            return new Dog(name);
        } else if (animalType.equals("Cat")) {
            return new Cat(name);
        }
        return new Animal(name);
    }
}
