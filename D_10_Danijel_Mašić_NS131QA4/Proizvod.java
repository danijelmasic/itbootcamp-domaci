package Domaci10;

public abstract class Proizvod {
    private String barKod;
    private String naziv;
    private int cena;


    public Proizvod(String barKod, String naziv, int cena) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.cena = cena;

    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void setPopust(int procenat){
        int popust = this.cena * procenat / 100;
        this.setCena( this.cena - procenat);
    }
    public abstract void poruci(int kolicina);

    @Override
    public String toString() {
        String ispis = "Cena je " + this.getCena() + ", naziv je " + this.getNaziv();
        return ispis;
    }
}
