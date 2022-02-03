import java.util.List;
import java.util.Scanner;

public class Nedelja3DomaciNedelja {
    public static void main(String[] args) {
        //Korisnik unosi recenicu. Potrebno je izbrojati Koliko reci je bilo u recenici koju je korisnik uneo I ispisati
        //taj broj u konzolu. Koristiti metode.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite neku recenicu: ");
        String unos = scanner.nextLine();
        int brojanje = kolicinaReci(unos);
        System.out.println("Broj reci u vasoj recenici je: " + brojanje);


    }
    public static int kolicinaReci (String recenica){
        String[] reci = recenica.split(" ");
        return reci.length;
    }

}
