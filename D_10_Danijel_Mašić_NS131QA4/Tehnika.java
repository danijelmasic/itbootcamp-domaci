package Domaci10;

public class Tehnika extends Proizvod {
    private int garancija;
    private double tezina;

    public Tehnika(String barKod, String naziv, int cena, int garancija, double tezina) {
        super(barKod, naziv, cena);
        this.garancija = garancija;
        this.tezina = tezina;
    }

    public int getGarancija() {
        return garancija;
    }

    public void setGarancija(int garancija) {
        this.garancija = garancija;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    @Override
    public void poruci(int kolicina) {
        int racun = this.getCena() * kolicina;
        if(this.tezina > 30){
            System.out.println("Dostava do vrata!!!");
        }
        System.out.println("Vas racun je: " + racun);
    }
}