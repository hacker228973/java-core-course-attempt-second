//package hw2;
//
//import hw2.Animals.Animal;
//import hw2.Visit.Visit;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class VetClinic {
//
//    public static void main(String[] args) {
//        // Создаем несколько клиентов и их питомцев
//        Client john = new Client("John");
//        Animal fluffy = new Animal("Fluffy", "Cat");
//        Visit visit1 = new Checkup(john, fluffy);
//
//        Client sarah = new Client("Sarah");
//        Animal fido = new Animal("Fido", "Dog", "Golden Retriever");
//        Visit visit2 = new Vaccination(sarah, fido, "Rabies");
//
//        // Добавляем визиты клиентам
//        john.addVisit(visit1);
//        sarah.addVisit(visit2);
//
//        // Выводим информацию о клиентах и их питомцах
//        for (Client client : clients) {
//            System.out.println("Client: " + client.getName());
//            List<Animal> pets = client.getPets();
//            for (Animal pet : pets) {
//                System.out.println("  Pet: " + pet.getName() + " (" + pet.getType() + ")");
//                List<Visit> visits = pet.getVisits();
//                for (Visit visit : visits) {
//                    System.out.println("    Visit type: " + visit.getType());
//                    System.out.println("    Visit date: " + visit.getDate());
//                    if (visit instanceof Examinable) {
//                        System.out.println("    Diagnosis: " + ((Examinable) visit).getDiagnosis());
//                        System.out.println("    Treatment: " + ((Examinable) visit).getTreatment());
//                    }
//                    if (visit instanceof Vaccination) {
//                        System.out.println("    Vaccination type: " + ((Vaccination) visit).getVaccineType());
//                    }
//                    System.out.println();
//                }
//            }
//        }
//    }
//}
