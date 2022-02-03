import java.util.List;

public class Prodavnica {

    private List<Kafa> kafe;
    private String adresa;
    private static int brojProdavnica = 0;
    private int brojKupljenihProizvoda;

    public Prodavnica(List<Kafa> kafe, String adresa) {
        this.kafe = kafe;
        this.adresa = adresa;
        this.brojKupljenihProizvoda = 0;
        brojProdavnica++;
    }

    public List<Kafa> getKafe() {
        return kafe;
    }

    public void setKafe(List<Kafa> kafe) {
        this.kafe = kafe;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public static int getBrojProdavnica() {
        return brojProdavnica;
    }

    public static void setBrojProdavnica(int brojProdavnica) {
        Prodavnica.brojProdavnica = brojProdavnica;
    }

    public int getBrojKupljenihProizvoda() {
        return brojKupljenihProizvoda;
    }

    public void setBrojKupljenihProizvoda(int brojKupljenihProizvoda) {
        this.brojKupljenihProizvoda = brojKupljenihProizvoda;
    }

    public void kupiKafu(Kafa kafa, int kolicina){
        int racun = kolicina * kafa.getCena();
        System.out.println("Vas ukupan racun je: " + racun);
    }
    public void popust(int popust){
        for(Kafa kafa : this.getKafe()){
            kafa.obracunajPopust(popust);
        }
    }
    public static Prodavnica najuspesnijaProdavnica(List<Prodavnica> prodavnice){
        int max = 0;
        for(Prodavnica prodavnica : prodavnice){
            if(prodavnica.getBrojKupljenihProizvoda() > max){
                max = prodavnica.getBrojKupljenihProizvoda();
            }
        }
        for(Prodavnica prodavnica : prodavnice){
            if(prodavnica.getBrojKupljenihProizvoda() == max){
                return prodavnica;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Prodavnica{" +
                "kafe=" + kafe +
                ", adresa='" + adresa + '\'' +
                ", brojKupljenihProizvoda=" + brojKupljenihProizvoda +
                '}';
    }
}

