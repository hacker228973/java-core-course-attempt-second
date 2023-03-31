//package hw2at2;
//
//import java.time.LocalDate;
//
//class MedicalVisit extends Visit {
//    private String treatment;
//
//    public MedicalVisit(LocalDate date, Animal animal, Client client, String diagnosis, String treatment) {
//        super(date, animal, client, diagnosis);
//        this.treatment = treatment;
//    }
//
//    public String getTreatment() {
//        return treatment;
//    }
//
//    public void setTreatment(String treatment) {
//        this.treatment = treatment;
//    }
//
//    @Override
//    public void perform() {
//        System.out.println("Performing medical visit on " + animal.getName() + " for " + diagnosis + " and treatment " + treatment);
//    }
//}
