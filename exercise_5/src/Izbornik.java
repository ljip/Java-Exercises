import java.util.InputMismatchException;
import java.util.Scanner;

public class Izbornik {
    private final Scanner scanner ;
    private final Evidencija evidencija;

    public Izbornik() {
        scanner = new Scanner(System.in);
        evidencija = new Evidencija();
    }
    public void ispisiIzbornik() {
        while (true) {
            System.out.println("""
                    Odaberite opciju:
                    1. Unos studenta
                    2. Pretraga studenta po indeksu
                    3. Ispis svih studenata u sustavu
                    """);
            int unos = 0;
            while (unos <= 0) {
                try {
                    unos = scanner.nextInt();
                } catch (InputMismatchException exception) {
                    System.out.println("Niste upisali broj!");
                    scanner.next();
                }
                if (unos <= 0) {
                    System.out.println("Morate izabrati jedan od ponudenih brojeva kao izbor.");
                }
            }
            switch (unos) {
                case 1 -> caseOne();
                case 2 -> caseTwo();
                case 3 -> caseThree();
                default -> System.out.println("Opcija ne postoji. Izaberite jednu s izbornika.");
            }
        }
    }

    private void caseOne() {
        System.out.println("Unesi ime: ");
        String ime = scanner.next();

        System.out.println("Unesi prezime: ");
        String prezime = scanner.next();

        System.out.println("Unesi broj indexa: ");
        String brojIndexa = scanner.next();

        System.out.println("Unesi godinu Studija: ");
        int godinaStudija = 0;
        while (godinaStudija == 0) {
            try {
                godinaStudija = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Unos nije bio broj");
                scanner.next();
            }
        }

        Student student = new Student(ime, prezime, brojIndexa, godinaStudija);

        evidencija.unosStudenta(student);
    }

    private void caseTwo() {
        System.out.println("Unesi broj indexa za pretragu studenta:");
        String indexStudenta = scanner.next();
        evidencija.pretragaStudenta(indexStudenta);
    }

    private void caseThree() {
        evidencija.ispisStudenata();
    }
}