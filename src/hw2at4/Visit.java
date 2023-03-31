package hw2at4;

import java.util.Date;

public class Visit {
    private Client client;
    private Animal animal;
    private String visitType;
    private String diagnosis;
    private String treatment;

    private Date nextVisitDate;

    public Visit(Client client, Animal animal, String visitType, String diagnosis, String treatment, String nextVisitDate) {
        this.client = client;
        this.animal = animal;
        this.visitType = visitType;
        this.diagnosis = diagnosis;
        this.treatment = treatment;

        this.nextVisitDate = parseDate(nextVisitDate);
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public void setNextVisitDate(String nextVisitDate) {
        this.nextVisitDate = parseDate(nextVisitDate);
    }

    public void printVisitDetails() {
        System.out.println("Visit Details:");
        System.out.println("Client: " + client.getName());
        System.out.println("Animal: " + animal.getName());
        System.out.println("Visit Type: " + visitType);
        System.out.println("Diagnosis: " + (diagnosis != null ? diagnosis : "None"));
        System.out.println("Treatment: " + (treatment != null ? treatment : "None"));
//        System.out.println("Visit Date: " + visitDate.toString());
        System.out.println("Next Visit Date: " + (nextVisitDate != null ? nextVisitDate.toString() : "None"));
    }

    private Date parseDate(String date) {
        // Реалізація методу для перетворення рядка у тип Date.
        return null;
    }
}