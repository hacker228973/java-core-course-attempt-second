//package hw2at2;
//
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Visit {
//    private Client client;
//    private Animal animal;
//    private String diagnosis;
//    private String treatment;
//    private LocalDate nextAppointment;
//    private List<Procedure> procedures;
//
//    public Visit(Client client, Animal animal, String diagnosis, String treatment, LocalDate nextAppointment) {
//        this.client = client;
//        this.animal = animal;
//        this.diagnosis = diagnosis;
//        this.treatment = treatment;
//        this.nextAppointment = nextAppointment;
//        procedures = new ArrayList<>();
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public Animal getAnimal() {
//        return animal;
//    }
//
//    public String getDiagnosis() {
//        return diagnosis;
//    }
//
//    public String getTreatment() {
//        return treatment;
//    }
//
//    public LocalDate getNextAppointment() {
//        return nextAppointment;
//    }
//
//    public List<Procedure> getProcedures() {
//        return procedures;
//    }
//
//    public void addProcedure(Procedure procedure) {
//        procedures.add(procedure);
//    }
//
//    public void setNextAppointment(LocalDate nextAppointment) {
//        this.nextAppointment = nextAppointment;
//    }
//}
