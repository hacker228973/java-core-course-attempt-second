//package hw2at2;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Client {
//    private String name;
//    private String phoneNumber;
//    private List<Animal> pets;
//
//    public Client(String name, String phoneNumber) {
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//        pets = new ArrayList<>();
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void addPet(Animal animal) {
//        pets.add(animal);
//        animal.setOwner(this);
//    }
//
//    public List<Animal> getPets() {
//        return pets;
//    }
//
//    @Override
//    public String toString() {
//        return name + " - " + phoneNumber;
//    }
//}