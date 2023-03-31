package hw2at4;

public class Animal {

    private String name;
    private int age;
    private double weight;

    public Animal( String name, int age) {

        this.name = name;
        this.age = age;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void sound() {
        System.out.println("Some animal sound");
    }
}