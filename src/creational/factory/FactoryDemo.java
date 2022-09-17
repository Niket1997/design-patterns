package creational.factory;

import creational.factory.concretecreators.PuppyDogCreator;
import creational.factory.concretecreators.RandomAnimalCreator;
import creational.factory.product.Animal;

public class FactoryDemo {
    public static void main(String[] args) {
        Animal animal = new RandomAnimalCreator().makeAnimal("Tom");
        animal.makeNoise();

        Animal puppyDog = new PuppyDogCreator().makeAnimal("Jared");
        puppyDog.makeNoise();
    }
}
