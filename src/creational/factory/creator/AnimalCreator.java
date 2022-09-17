package creational.factory.creator;

import creational.factory.product.Animal;

public interface AnimalCreator {
    public Animal makeAnimal(String name);
}
