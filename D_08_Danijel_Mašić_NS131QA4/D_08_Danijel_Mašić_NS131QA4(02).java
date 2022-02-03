import java.util.Locale;
import java.util.Scanner;

public class Nedelja3DomaciNedelja2 {
    public static void main(String[] args) {
        //Inicijalizujte neki string. Korisnik unosi jedno slovo. Prebrojati Koliko puta se slovo koje je korisnik uneo
        //ponavlja u stringu. Koristiti metode.
   String recenica = "U subotu je padala kisa";
   Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite slovo: ");
        String slovo = scanner.nextLine();
        int broj = prebroj(recenica.toLowerCase(), slovo.toLowerCase());
        System.out.println("Slovo " + slovo + " se pojavljuje " + broj + " puta.");

    }
    public static int prebroj(String recenica, String slovo){
        String[] niz = recenica.split("");
        int brojac = 0;
        for(int i = 0; i < niz.length; i++){
            if(niz[i].equals(slovo)){
                brojac++;
            }
        } return brojac;
    }

}
