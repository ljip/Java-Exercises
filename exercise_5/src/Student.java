public class Student {
    private String ime, prezime, brojIndexa;
    private int godinaStudija;


    public Student(String ime, String prezime, String brojIndexa, int godinaStudija){
        this.ime = ime;
        this.prezime = prezime;
        this.godinaStudija = godinaStudija;
        this.brojIndexa = brojIndexa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }
    public String getBrojIndexa() {
        return brojIndexa;
    }
    public void setBrojIndexa(String brojIndexa) {
        this.brojIndexa = brojIndexa;
    }
    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }
}