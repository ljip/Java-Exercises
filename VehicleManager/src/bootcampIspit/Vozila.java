package bootcampIspit;

public class Vozila implements VehiclesInterface{
    /*
     Parent klasa koju nasljeduju automobil i kamion.
     Sadrzi sve agrumente osim kapaciteta tereta koji se
     koristi kod klase kamion i karoserija koja se koristi
     kod u klasi automobil
    */

    public String proizvodac, model, boja, oznaka, tipGoriva;
    public int godinaProizvodnje, brojVrata;
    private String vin;

    public Vozila(String proizvodac, String model, String boja,
                  String oznaka, String tipGoriva, int godinaProizvodnje,
                  int brojVrata, String vin)
    {
        this.proizvodac = proizvodac;
        this.model = model;
        this.boja = boja;
        this.oznaka = oznaka;
        this.tipGoriva = tipGoriva;
        this.godinaProizvodnje = godinaProizvodnje;
        this.brojVrata = brojVrata;
        this.vin = vin;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    /*
    toString metoda, koristi se u klasi flotaVozila
    za ispis podataka o vozilima nakon sto korisnik
    zatrazi iste.
     */
    @Override
    public String toString() {
        return "bootcampIspit.Vozila{" +
                "proizvodac='" + proizvodac + '\'' +
                ", model='" + model + '\'' +
                ", boja='" + boja + '\'' +
                ", oznaka='" + oznaka + '\'' +
                ", tipGoriva='" + tipGoriva + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", brojVrata=" + brojVrata +
                ", vin='" + vin + '\'' +
                '}';
    }
}

