package creational.factory.product;

public class Animal {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    public void makeNoise() {
        System.out.println("I'm " + name + ".");
        System.out.println("I'm stupid.");
    }
}
