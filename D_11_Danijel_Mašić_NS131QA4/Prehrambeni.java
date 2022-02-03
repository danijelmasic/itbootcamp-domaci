package Domaci10;

import java.time.LocalDate;

public class Prehrambeni extends Proizvod {

    private LocalDate datumIsteka;

    public Prehrambeni(String barKod, String naziv, int cena, LocalDate datumIsteka) {
        super(barKod, naziv, cena);
        this.datumIsteka = datumIsteka;
    }

    public LocalDate getDatumIsteka() {
        return datumIsteka;
    }

    public void setDatumIsteka(LocalDate datumIsteka) {
        this.datumIsteka = datumIsteka;
    }

    @Override
    public void poruci(int kolicina) {
        LocalDate today = LocalDate.now();
        if (this.datumIsteka.isBefore(today)) {
            System.out.println("Datum istekao!");
        } else {
            int racun = this.getCena() * kolicina;
            System.out.println("Vas racun je: " + racun);
        }
    }
}
