package bootcampIspit;

import java.util.HashMap;
import java.util.Map;


public class FlotaVozila  implements VehiclesInterface{
    // kreiranje hashmap za vozila i njeno instanciranje u konstruktoru

    private Map<String, Vozila> mapaVozila;
    public FlotaVozila(){
        this.mapaVozila = new HashMap<>();
    }

    /*
     metoda za unos automobila prema korisnikovom unos,
     vin se koristi kao kljuc, a automobil se unosi kao objekt
     */
    public void unosAutomobila(Automobil automobil) {
        mapaVozila.put(automobil.getVin(), automobil);
    }

    /* metoda za unos kamiona prema korisnikovom unos,
     vin se koristi kao kljuc, a kamion se unosi kao objekt
    */

    public void unosKamiona(Kamion kamion) {
        mapaVozila.put(kamion.getVin(), kamion);
    }

    /*
    metoda prima parametar tipa String za pretragu vina nakon
    korisnikovog unosa. If petljom pretrazuje kljuc,
    instancira novi objekt te vraca vozilo nakon pretrage
    */
    public void pretragaVin(String vin) {
        if (mapaVozila.containsKey(vin)) {
            Vozila vozila = mapaVozila.get(vin);
            System.out.println(vozila);
        } else {
            System.out.println("Vozilo nije pronadeno.");
        }
    }

    /*
    metoda prima parametar tipa String za pretragu proizvodaca,
    If petljom pretrazuje vrijednosti u mapi, instancira novi objekt
    te vraca proizvodaca vozila na korisnikov zahtjev.
    */
    public void pretragaProizvodac(String proizvodac) {
        if (mapaVozila.containsValue(proizvodac)) {
            Vozila vozila = mapaVozila.get(proizvodac);
            System.out.println(vozila);
        } else {
            System.out.println("Vozilo nije pronadeno.");
        }
    }

    /*
    metoda prima parametar tipa String za brisanje vozila,
    If petljom pretrazuje kljuc u mapi, brise kljuc,
    te vraca obavijest korisniku kako je vozilo izbrisano iz sustava.
    */
    public void brisanjeVozila(String vin) {
        if (mapaVozila.containsKey(vin)) {
            mapaVozila.remove(vin);
            System.out.println("Vozilo izbrisano!");
        } else {
            System.out.println("Vozilo nije pronadeno.");
        }
    }

    /*
    metoda se pokrece na korisnikov zahtjev, for petljom
    se instancira novi objekt te se pretrazuju vrijednosti u
    mapi vozila, ispisuje sva vozila u mapi.
    */
    public void ispisVozila() {
        System.out.println("Sva vozila:");
        for (Vozila vozila : mapaVozila.values()) {
            System.out.println(vozila.toString());
        }
    }
}
