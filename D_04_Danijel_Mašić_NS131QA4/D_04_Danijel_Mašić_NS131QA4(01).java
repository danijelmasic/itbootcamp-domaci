import java.util.Scanner;

public class DomaciZadatak2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Unesite mesec: ");
        String mesec = s.nextLine();

        switch (mesec.toLowerCase()){
            case "januar":
            case "mart":
            case "maj":
            case "jul":
            case "avgust":
            case "oktobar":
            case "decembar":
                System.out.println("Ovaj mesec ima 31 dan.");
                break;
            case "april":
            case "jun":
            case "septembar":
            case "novembar":
                System.out.println("Ovaj mesec ima 30 dana.");
                break;
            case "februar":
                System.out.println("Ovaj mesec ima 28 dana.");
                break;
            default:
                System.out.println("Pogresan unos.");

        }

        /*
        2. Zadatak (koristiti switch)
Od korisnika zahtevati da unese mesec.
U zavisnosti koji mesec u godini je unet ispisati Koliko taj mesec ima dana.
**Racunati da godina nije prestupna (ne obazirati se na to)

         */
    }
}
