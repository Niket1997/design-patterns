package creational.factory;

import creational.factory.product.Animal;
import creational.factory.simplefactory.SimpleAnimalCreator;

public class SimpleFactoryDemo {
    public static void main(String[] args) {
        Animal dog = SimpleAnimalCreator.createAnimal("Dog", "Alfred");
        dog.makeNoise();

        Animal cat = SimpleAnimalCreator.createAnimal("Cat", "Tom");
        cat.makeNoise();
    }
}
