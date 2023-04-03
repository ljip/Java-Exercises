package bootcampIspit;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Izbornik implements VehiclesInterface{

    private final Scanner scanner;
    private final FlotaVozila flotaVozila;
    public Izbornik() {
        scanner = new Scanner(System.in);
        flotaVozila = new FlotaVozila();
    }

    /*
    metoda za pokretanje aplikacije,
    Koristi se while petlja sve dok korisnik ne odluci izadi iz aplikacije.
    Switch prima parametar korisnikovUnos, nakon sto korisnik izabere opcju te
    preusmjerava na druge metode.
     */
    public void pokreniAplikaciju() {
        while (true) {
            System.out.println("""
                    Molimo izaberite opciju:
                    1. Unos vozila
                    2. Pretraga vozila prema proizvodacu ili modelu
                    3. Prikazi sva vozila u sustavu
                    4. Izbrisi vozilo iz sustava
                    5. Izadi iz programa
                    """);
            int korisnikovUnos = getKorisnikovUnosBroja();

            switch (korisnikovUnos) {
                case 1:
                    unosVozila();
                    break;
                case 2:
                    pretragaVozilaPremaProizvodacuIliModelu();
                    break;
                case 3:
                    ispisVozila();
                    break;
                case 4:
                    brisanjeVozila();
                    break;
                case 5:
                    izlazIzPrograma();
                    return;
                default:
                    printOpcijaNePostoji();
                    break;
            }
        }
    }

    /*
    metoda za dohvacanje korisnikove opcije, metoda je porenuta
    sve dok korisnik ne unese broj koji je jednak ili manji broju 0.
    Ako korisnik unese slovo ili znak, prikazuje mu se greska te se
    nudi ponovni unos scannerom koji je samo next jer nextInt hvata i
    novi red kao unos. Na kraju metode se vraca korisnikov unos.
     */
    private int getKorisnikovUnosBroja() {
        int korisnikovUnos = 0;
        while (korisnikovUnos <= 0) {
            try {
                korisnikovUnos = scanner.nextInt();
            } catch (InputMismatchException exception) {

                System.out.println("""
                        Niste upisali broj!
                        Molimo pokušajte ponovno.
                        """);
                scanner.next();
            }
        }
        return korisnikovUnos;
    }

    private static void printOpcijaNePostoji() {
        System.out.println("Opcija ne postoji. Izaberite jednu s izbornika.");
    }

    /*
    metoda prima korisnikov unos, switchom se preusmjerava na ostale metode (opcije)
     */
    private void pretragaVozilaPremaProizvodacuIliModelu() {
        System.out.println("""
                Odaberite jednu od opcija za pretragu vozila:
                1. vin
                2. proizvodac
                """);
        int korisnikovUnos = getKorisnikovUnosBroja();
        switch (korisnikovUnos) {
            case 1:
                vinPretraga();
                break;
            case 2:
                pretragaProizvodac();
                break;
            default:
                printOpcijaNePostoji();
                break;
        }
    }

    /*
    metoda prima korisnikov unos te preusmjerava na ostale metode (opcije)
     */
    private void unosVozila() {
        System.out.println("""
                Odaberite vozilo koje zelite unijeti:
                1. auto
                2. kamion
                """);
        int korisnikovUnos = getKorisnikovUnosBroja();
        switch (korisnikovUnos) {
            case 1:
                unosAutomobila();
                break;
            case 2:
                unosKamiona();
                break;
            default:
                printOpcijaNePostoji();
                break;
        }
    }

    private void unosAutomobila() {
        System.out.println("Unesi proizvodaca: ");
        String proizvodac = scanner.next();

        System.out.println("Unesi model: ");
        String model = scanner.next();

        System.out.println("Unesi boju: ");
        String boja = scanner.next();

        System.out.println("Unesi oznaku: ");
        String oznaka = scanner.next();

        System.out.println("Unesi tip goriva: ");
        String tipGoriva = scanner.next();

        // poziva se metoda u kojoj je implementiran try catch blok
        System.out.println("Unesi godinu proizvodnje: ");
        int godinaProizvodnje = getKorisnikovUnosBroja();

        // poziva se metoda u kojoj je implementiran try catch blok
        System.out.println("Unesi broj vrata: ");
        int brojVrata = getKorisnikovUnosBroja();

        System.out.println("Unesi vin: ");
        String vin = scanner.next();

        System.out.println("Unesi karoseriju: ");
        String karoserija = scanner.next();

        // instancira se novi objekt automobil s navedenim parametrima.
        Automobil automobil = new Automobil(proizvodac, model, boja, oznaka, tipGoriva, godinaProizvodnje, brojVrata, vin, karoserija);

        // objekt "automobil" se kao argument salje metodi unosAutomobila koja
        // kao parametar prima objekt "automobil" i unosi ga u mapu
        flotaVozila.unosAutomobila(automobil);
    }

    private void unosKamiona() {
        System.out.println("Unesi proizvodaca: ");
        String proizvodac = scanner.next();

        System.out.println("Unesi model: ");
        String model = scanner.next();

        System.out.println("Unesi boju: ");
        String boja = scanner.next();

        System.out.println("Unesi oznaku: ");
        String oznaka = scanner.next();

        System.out.println("Unesi tip goriva: ");
        String tipGoriva = scanner.next();

        // poziva se metoda u kojoj je implementiran try catch blok
        System.out.println("Unesi godinu proizvodnje: ");
        int godinaProizvodnje = getKorisnikovUnosBroja();

        // poziva se metoda u kojoj je implementiran try catch blok
        System.out.println("Unesi broj vrata: ");
        int brojVrata = getKorisnikovUnosBroja();

        System.out.println("Unesi vin: ");
        String vin = scanner.next();

        // poziva se metoda u kojoj je implementiran try catch blok
        System.out.println("Unesi kapacitet tereta: ");
        int kapacitetTereta = getKorisnikovUnosBroja();

        // instancira se novi objekt automobil s navedenim parametrima.
        Kamion kamion = new Kamion(proizvodac, model, boja, oznaka, tipGoriva, godinaProizvodnje, brojVrata, vin, kapacitetTereta);

        // objekt "kamion" se kao arguemnt salje metodi unosKamiona koja
        // kao parametar prima objekt "kamion" i unosi ga u mapu
        flotaVozila.unosKamiona(kamion);
    }

    // metoda kojom vracamo korisnikov unos kao parametar tipa String te ga pozivamo
    // u metodama za pretragu
    private String getKorisnikovUnosString(String pitanje) {
        System.out.println(pitanje);
        return scanner.next();
    }

    // metoda za pretragu vozila prema Vinu te pozivamo metodu
    // getKorisnikovUnos za postavljanje upita
    public void vinPretraga() {
        String vin = getKorisnikovUnosString("Unesi broj vin-a za pretragu vozila:");
        flotaVozila.pretragaVin(vin);
    }

    // metoda za pretragu vozila prema proizvodacu te pozivamo metodu
    // getKorisnikovUnos za postavljanje upita
    private void pretragaProizvodac() {
    String proizvodac = getKorisnikovUnosString("Unesi proizvodaca za pretragu vozila:");
        flotaVozila.pretragaProizvodac(proizvodac);
    }

    // metoda za ispis vozila, poziva se metoda ispisVozila iz klase flotaVozila.
    private void ispisVozila() {
        flotaVozila.ispisVozila();
    }

    // metoda za brisanje vozila prema Vinu te pozivamo metodu
    // getKorisnikovUnos za postavljanje upita
    private void brisanjeVozila() {
        String vinPretraga = getKorisnikovUnosString("Unesi broj vin-a za brisanje vozila iz sustava:");
        flotaVozila.brisanjeVozila(vinPretraga);
    }

    private void izlazIzPrograma() {
        System.out.println("Hvala sto ste koristili program!");
    }
}
