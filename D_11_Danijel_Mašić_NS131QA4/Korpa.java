package Domaci10;

import java.util.HashMap;


public class Korpa {

        private Kupac kupac;
        private HashMap <Proizvod, Integer> proizvodi = new HashMap<>();

        public Korpa(Kupac kupac, HashMap<Proizvod, Integer> proizvodi) {
                this.kupac = kupac;
                this.proizvodi = proizvodi;
        }

        public Korpa(Kupac kupac) {
        }

        public Kupac getKupac() {
                return kupac;
        }

        public void setKupac(Kupac kupac) {
                this.kupac = kupac;
        }

        public HashMap<Proizvod, Integer> getProizvodi() {
                return proizvodi;
        }

        public void addProizvod(Proizvod proizvod){
                System.out.println(proizvod);
                if(proizvodi.containsKey(proizvod)){
                        proizvodi.put(proizvod, proizvodi.get(proizvod) + 1);
                }
                else{
                        proizvodi.put(proizvod, 1);
                }
        }
        public void ispisiRacun(){
                System.out.println("naziv   kolicina   cena");

                for(Proizvod p : proizvodi.keySet()){
                        String s = "";
                        s += p.getNaziv() + "   " + proizvodi.get(p) + "   " + p.getCena() * proizvodi.get(p);
                        System.out.println(s);
                }
        }
}

