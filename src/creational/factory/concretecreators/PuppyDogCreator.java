package creational.factory.concretecreators;

import creational.factory.concreteproducts.Dog;
import creational.factory.creator.AnimalCreator;
import creational.factory.product.Animal;

public class PuppyDogCreator implements AnimalCreator {
    @Override
    public Animal makeAnimal(String name) {
        Dog puppy = new Dog(name);
        puppy.makeCute();
        return puppy;
    }
}
