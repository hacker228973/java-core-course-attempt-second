//package hw2at2;
//
//import java.time.LocalDate;
//
//class VaccinationVisit extends Visit {
//    private String vaccine;
//
//    public VaccinationVisit(LocalDate date, Animal animal, Client client, String diagnosis, String vaccine) {
//        super(date, animal, client, diagnosis);
//        this.vaccine = vaccine;
//    }
//
//    public String getVaccine() {
//        return vaccine;
//    }
//
//    public void setVaccine(String vaccine) {
//        this.vaccine = vaccine;
//    }
//
//    @Override
//    public void perform() {
//        System.out.println("Performing vaccination visit on " + animal.getName() + " for " + diagnosis + " and vaccine " + vaccine);
//    }
//}
//
