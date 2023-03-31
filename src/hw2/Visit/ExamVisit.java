//package hw2.Visit;
//
//import hw2.Animals.Animal;
//import hw2.Client;
//
//import java.util.Date;
//
//public class ExamVisit implements Visit {
//    private Client client;
//    private Animal animal;
//    private String diagnosis;
//    private Date nextVisitDate;
//
//    public ExamVisit(Client client, Animal animal, String diagnosis, Date nextVisitDate) {
//        this.client = client;
//        this.animal = animal;
//        this.diagnosis = diagnosis;
//        this.nextVisitDate = nextVisitDate;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Exam visit for " + animal.getName() + " (" + animal.getType() + ")");
//        System.out.println("Owner: " + client.getName() + " Phone: " + client.getPhone());
//        System.out.println("Diagnosis: " + diagnosis);
//        System.out.println("Next visit: " + nextVisitDate);
//    }
//
//    @Override
//    public Client getClient() {
//        return client;
//    }
//
//    @Override
//    public Animal getAnimal() {
//        return animal;
//    }
//
//    @Override
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    @Override
//    public Date getNextVisitDate() {
//        return nextVisitDate;
//    }
//}