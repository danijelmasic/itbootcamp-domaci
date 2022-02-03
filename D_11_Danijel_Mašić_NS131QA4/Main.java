package Domaci10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Kupovina(krejirajKorpu(), kreirajProizvode());
    }

        private static List<Proizvod> kreirajProizvode () {
            Proizvod p1 = new Prehrambeni("475sdi7", "mleko", 100,
                    LocalDate.of(2021, 12, 30));
            Proizvod p2 = new Tehnika("345kh3", "sporet", 35000, 5, 40);
            Proizvod p3 = new
                    AlkoholnaPica("654k33", "pivo", 120, "staklena", 10);
            Proizvod p4 = new Pice("774gg", "sok breskva", 200, "kartonska");

            List<Proizvod> nizProizvoda = new ArrayList<>();
            nizProizvoda.add(p1);
            nizProizvoda.add(p2);
            nizProizvoda.add(p3);
            nizProizvoda.add(p4);


            return nizProizvoda;
        }


    public static Korpa krejirajKorpu() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite vase ime: ");
        String ime = scanner.next();


        System.out.print("Unesite vase prezime: ");
        String prezime = scanner.next();


        return new Korpa(new Kupac(ime, prezime));
    }

    private static void Kupovina(Korpa korpa, List<Proizvod> proizvodi) {
        Scanner scanner = new Scanner(System.in);
        String unos = "";

        while (!unos.equals("zavrsiKupovinu")) {
            System.out.print("Unesite barkod: ");
            unos = scanner.next();
            System.out.println();

            Boolean pExists = false;

            for (Proizvod p : proizvodi) {
                if (p.getBarKod().equals(unos)) {
                    korpa.addProizvod(p);
                    pExists = true;
                    break;
                }
            }
            if (pExists = true) {
                System.out.println("Dodato u korpu!");
            } else {
                System.out.println("Proizvod ne postoji!");
            }
        }
        korpa.ispisiRacun();
    }

}
