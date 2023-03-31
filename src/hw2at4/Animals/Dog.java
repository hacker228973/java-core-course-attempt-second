package hw2at4.Animals;

import hw2at4.Animal;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age) {
        super( name, age );

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void sound() {
        System.out.println("Woof");
    }
}
