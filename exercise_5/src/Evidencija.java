import java.util.*;


public class Evidencija {
    private Map<String, Student> mapaStudenta;

    public Evidencija() {
        this.mapaStudenta = new HashMap<>();
    }

    public void unosStudenta(Student student) {
        mapaStudenta.put(student.getBrojIndexa(), student);
    }
    public void pretragaStudenta(String index) {
        if (mapaStudenta.containsKey(index)) {
            Student student = mapaStudenta.get(index);
            System.out.println(student.getIme() + " " + student.getPrezime());
        } else {
            System.out.println("Student sa indexom " + index + " nije pronađen.");
        }
    }
    public void ispisStudenata() {
        System.out.println("Svi studenti:");
        for (Student student : mapaStudenta.values()) {
            System.out.println(student.getIme() + " " + student.getPrezime());
        }
    }
}
