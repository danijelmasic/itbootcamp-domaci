import java.util.Arrays;

public class Kafa {
    /*Privatno polje naziv
- Privatno polje velicina
- Privatno polje niz stringova sastojci
- Privatno polje cena*/
    private String naziv;
    private String velicina;
    private String[] sastojci;
    private int cena;

public Kafa(String naziv, String velicina, String[] sastojci, int cena){
    this.naziv = naziv;
    this.velicina = velicina;
    this.sastojci = sastojci;
    this.cena = cena;
}

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getVelicina() {
        return velicina;
    }

    public void setVelicina(String velicina) {
        this.velicina = velicina;
    }

    public String[] getSastojci() {
        return sastojci;
    }

    public void setSastojci(String[] sastojci) {
        this.sastojci = sastojci;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public void obracunajPopust(int procenat){
    int popust = this.cena * procenat / 100;
    this.cena = this.cena - procenat;
    }

    @Override
    public String toString() {
        return "Kafa{" +
                "naziv='" + naziv + '\'' +
                ", velicina='" + velicina + '\'' +
                ", sastojci=" + Arrays.toString(sastojci) +
                ", cena=" + cena +
                '}';
    }
}
