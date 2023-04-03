package bootcampIspit;

public class Kamion extends Vozila implements VehiclesInterface{
  /*
   child klasa, nasljeduje parent klasu vozilo. Unikatna varijabla je
   kapacitet tereta.
   */

  private int kapacitetTereta;

  public Kamion(String proizvodac, String model, String boja, String oznaka,
                String tipGoriva, int godinaProizvodnje, int brojVrata,
                String vin, int kapacitetTereta)
  {
    super(proizvodac, model, boja, oznaka, tipGoriva, godinaProizvodnje, brojVrata, vin);
  }

  public int getKapacitetTereta() {
    return kapacitetTereta;
  }

  public void setKapacitetTereta(int kapacitetTereta) {
    this.kapacitetTereta = kapacitetTereta;
  }

}
