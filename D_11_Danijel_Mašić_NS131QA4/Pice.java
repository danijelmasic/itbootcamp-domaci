package Domaci10;

public class Pice extends Proizvod{

    private String ambalaza;

    public Pice(String barKod, String naziv, int cena, String ambalaza) {
        super(barKod, naziv, cena);
        this.ambalaza = ambalaza;
    }

    public String getAmbalaza() {
        return ambalaza;
    }

    public void setAmbalaza(String ambalaza) {
        this.ambalaza = ambalaza;
    }

    @Override
    public void poruci(int kolicina) {

        int racun = this.getCena() + izracunajCenuAmbalaze() * kolicina;
        System.out.println("Vas racun je: " + racun);

    }
    public int izracunajCenuAmbalaze(){
        int cenaAmbalaze = 0;
        if(this.getAmbalaza().equals("kartonska")){
            cenaAmbalaze = this.getCena()/10;
        }
        else if(this.getAmbalaza().equals("plasticna")){
            cenaAmbalaze = this.getCena()/20;
        }
       else if(this.getAmbalaza().equals("staklena")){
            cenaAmbalaze = this.getCena()/30;
        }
       else if(this.getAmbalaza().equals("limenka")){
            cenaAmbalaze = this.getCena()/30;
        }
       return cenaAmbalaze;
    }
}
