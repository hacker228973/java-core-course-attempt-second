//package hw2.Visit;
//
//import hw2.Animals.Animal;
//import hw2.Client;
//
//import java.util.Date;
//
//abstract class IllnessVisit implements Visit {
//    private Client client;
//    private Animal animal;
//    private String diagnosis;
//    private String treatment;
//    private Date nextVisitDate;
//
//    public IllnessVisit(Client client, Animal animal, String diagnosis, String treatment, Date nextVisitDate) {
//        this.client = client;
//        this.animal = animal;
//        this.diagnosis = diagnosis;
//        this.treatment = treatment;
//        this.nextVisitDate = nextVisitDate;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Illness visit for " + animal.name + " (" + animal.breed + ")");
//        System.out.println("Owner: " + client.getName() + " Phone: " + client.getPhone());
//        System.out.println("Diagnosis: " + diagnosis);
//        System.out.println("Treatment: " + treatment);
//        System.out.println("Next visit: " + nextVisitDate);
//    }
//}
