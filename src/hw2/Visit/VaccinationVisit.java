//package hw2.Visit;
//
//import hw2.Animals.Animal;
//import hw2.Client;
//
//import java.util.Date;
//
//class VaccinationVisit implements Visit {
//    private Client client;
//    private Animal animal;
//    private String vaccineName;
//    private Date nextVisitDate;
//
//    public VaccinationVisit(Client client, Animal animal, String vaccineName, Date nextVisitDate) {
//        this.client = client;
//        this.animal = animal;
//        this.vaccineName = vaccineName;
//        this.nextVisitDate = nextVisitDate;
//    }
//
//    @Override
//    public void execute() {
//        System.out.println("Vaccination visit for " + animal.name + " (" + animal.breed + ")");
//        System.out.println("Owner: " + client.getName() + " Phone: " + client.getPhone());
//        System.out.println("Vaccine name: " + vaccineName);
//        System.out.println("Next visit: " + nextVisitDate);
//    }
//}
