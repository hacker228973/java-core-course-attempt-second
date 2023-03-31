//package hw2at2;
//
//import java.util.Date;
//
//public abstract class Checkup implements Examinable {
//    private final String diagnosis;
//    private final String treatment;
//    private final Date nextVisitDate;
//
//    public Checkup(String diagnosis, String treatment, Date nextVisitDate) {
//        this.diagnosis = diagnosis;
//        this.treatment = treatment;
//        this.nextVisitDate = nextVisitDate;
//    }
//
//    @Override
//    public void exam() {
//        System.out.println("Performing checkup with diagnosis: " + diagnosis);
//        System.out.println("Treatment: " + treatment);
//        System.out.println("Next visit date: " + nextVisitDate);
//    }
//}
