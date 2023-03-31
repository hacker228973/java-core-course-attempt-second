//package hw2at2;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class ExamVisit extends Visit implements Examinable {
//    public ExamVisit(Client client, Animal animal, String diagnosis, String treatment, LocalDate nextVisitDate, List<String> procedures) {
//        super(client, animal, diagnosis, treatment, nextVisitDate, procedures);
//    }
//
//    @Override
//    public void perform() {
//
//    }
//
//    public String getType() {
//        return "exam";
//    }
//
//    public void performExam() {
//        System.out.println("Performing examination on " + getAnimal().getName());
//    }
//
//    @Override
//    public void doExamination(String diagnosis) {
//
//    }
//}
