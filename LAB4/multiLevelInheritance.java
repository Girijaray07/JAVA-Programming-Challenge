class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
}

class Mammal extends Animal {
    boolean hasFur;

    public Mammal(String name, boolean hasFur) {
        super(name);
        this.hasFur = hasFur;
    }
    public void showFeatures() {
        System.out.println(name + " " + (hasFur ? "has" : "does not have") + " fur");
    }
}

class Dog extends Mammal {
    String breed;

    public Dog(String name, boolean hasFur, String breed) {
        super(name, hasFur);
        this.breed = breed;
    }
    public void makeSound() {
        System.out.println(name + " (a " + breed + ") barks!");
    }
}

public class multiLevelInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy", true, "Golden Retriever");
        dog.showFeatures();
        dog.makeSound();
    }
}