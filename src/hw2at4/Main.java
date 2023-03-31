package hw2at4;

import hw2at4.Animals.Cat;
import hw2at4.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        // Створення клієнтів
        Client client1 = new Client("John", "Doe");
        Client client2 = new Client("Jane", "Doe");

        // Створення тварин
        Cat cat1 = new Cat("Fluffy", 17);
        Dog dog1 = new Dog("Fido", 54);

        // Створення візитів
        Visit visit1 = new Visit(client1, cat1, "Checkup", "Healthy", "None", null);
        Visit visit2 = new Visit(client2, dog1, "Vaccination", null, "Rabies", null);

        // Виклик методів класу Visit
        visit1.printVisitDetails();
        visit2.printVisitDetails();
    }
}