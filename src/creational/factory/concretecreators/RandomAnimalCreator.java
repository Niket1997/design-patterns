package creational.factory.concretecreators;

import creational.factory.concreteproducts.Cat;
import creational.factory.concreteproducts.Dog;
import creational.factory.creator.AnimalCreator;
import creational.factory.product.Animal;

import java.util.Random;

public class RandomAnimalCreator implements AnimalCreator {
    @Override
    public Animal makeAnimal(String name) {
        int rand = new Random().nextInt();
        if (rand % 2 == 0) {
            return new Dog(name);
        }
        return new Cat(name);
    }
}
