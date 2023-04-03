package bootcampIspit;

public class Automobil extends Vozila  implements VehiclesInterface{
    /*
    child klasa, nasljeduje parent klasu vozilo. Unikatna varijabla je
    karoserija.
    */

    private String karoserija;

    public Automobil(String proizvodac, String model, String boja,
                     String oznaka, String tipGoriva, int godinaProizvodnje,
                     int brojVrata, String vin, String karoserija)
    {
        super(proizvodac, model, boja, oznaka, tipGoriva, godinaProizvodnje, brojVrata, vin);
    }

    public String getKaroserija() {
        return karoserija;
    }

    public void setKaroserija(String karoserija) {
        this.karoserija = karoserija;
    }
}
