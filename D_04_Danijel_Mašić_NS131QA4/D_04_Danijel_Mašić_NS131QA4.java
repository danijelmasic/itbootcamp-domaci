import java.util.Locale;
import java.util.Scanner;

public class DomaciZadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Kako ocenjujete nasu uslugu (1-10): ");
        int usluga = s.nextInt();
        System.out.print("Kako ocenjujete nas kvalitet (1-10): ");
        int kvalitet = s.nextInt();
        int prosek = (usluga + kvalitet) / 2;

        if(usluga < 1 || usluga > 10 && kvalitet < 1 || kvalitet > 10){
            System.out.println("Jedna ili vise vrednosti nisu validne.");
        }else if(prosek >= 5){
            System.out.println("Prosek je veci od 5");
        }else if(prosek < 5 && usluga == 1){
            System.out.println("Treba popraviti uslugu!");
        }else if(prosek < 5 && kvalitet == 1){
            System.out.println("Treba popraviti kvalitet!");
        }else{
            System.out.println("Prosek je manji od 5.");
        }

        /*
Korisiku se nudi da unese redom ocene za kvalitet I uslugu nekog restorana
Ocene sacuvati u dve  odvojene promeljive. (ocene su celi brojevi od 1 do 10)
Ako korisnik nije uneo validne podatke za ocene ispisati poruku da podaci nisu validni.
Ako je prosek ocena veci od 5 ispisati poruku “Prosek veci od 5”
Ako je prosek manji od 5 I ocena za kvalitet je 1 ispisati poruku “Treba popraviti kvalitet”
Ako je prosek manji od 5 I ocena za uslugu je 1 ispisati poruku “Treba popraviti uslugu”
         */







    }
}
