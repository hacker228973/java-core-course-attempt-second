package hw2at4.Animals;

import hw2at4.Animal;

public class Cat extends Animal {
    private int hairLength;

    public Cat(String name, int age) {
        super (name, age);
    }

    public int getHairLength() {
        return hairLength;
    }

    public void setHairLength(int hairLength) {
        this.hairLength = hairLength;
    }

    public void sound() {
        System.out.println("Meow");
    }
}
