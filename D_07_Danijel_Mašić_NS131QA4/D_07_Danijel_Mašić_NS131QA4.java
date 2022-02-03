import java.util.Scanner;

public class MetodeDomaciZadatakIksOks {
    public static void main(String[] args) {

        String igracZnak = izaberiZnak();

        String racunarZnak = nadjiRacunarZnak(igracZnak);

        String[] tabla = new String[9];

        isprintajTablu(tabla);

        for (int j = 0; j < tabla.length - 4; j++) {
            System.out.println();
            int polje;
            do {
                polje = izaberiPolje();
            } while (tabla[polje] != null);

            tabla[polje] = igracZnak;
            if (j == 4) {
                for (int i = 0; i < tabla.length; i++) {

                    isprintajPolje(tabla, i);
                }
                break;
            }

            int n;
            do{
                n = (int) Math.abs(Math.floor(Math.random() * 10 - 1));

            }while(tabla[n] != null);
            tabla[n] = racunarZnak;

            for(int i = 0; i < tabla.length; i++){

                isprintajPolje(tabla, i);
            }
        }
    }

    public static String izaberiZnak() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Izaberite svoj znak (x ili o): ");
        String igracZnak = scan.nextLine().toLowerCase();
        while(!igracZnak.equals("x") && !igracZnak.equals("o")){
            System.out.print("Izaberite svoj znak (x ili o): ");
            igracZnak = scan.nextLine().toLowerCase();

        }

        return igracZnak;
    }

    public static String nadjiRacunarZnak(String igracZnak) {

        if (igracZnak.equals("x")) {
            return "o";
        } else if (igracZnak.equals("o")) {
            return "x";
        } else {
            System.out.println("Molim izaberite validan znak (x ili o)");
        }

        return null;
    }

    public static void isprintajTablu(String[] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            if (i == 3) {
                System.out.println();
                System.out.print(tabla[i] + " ");
            } else if (i == 6) {
                System.out.println();
                System.out.print(tabla[i] + " ");
            } else {
                System.out.print(tabla[i] + " ");
            }
        }
    }

    public static void isprintajPolje(String[] tabla, int pozicija) {
        if (pozicija == 3) {
            System.out.println();
            System.out.print(tabla[pozicija] + " ");
        } else if (pozicija == 6) {
            System.out.println();
            System.out.print(tabla[pozicija] + " ");
        } else {
            System.out.print(tabla[pozicija] + " ");
        }
    }

    public static int izaberiPolje() {
        System.out.print("Izaberite polje (0 - 8): ");
        Scanner scan = new Scanner(System.in);
        int broj = scan.nextInt();
        while (broj > 8 || broj < 0) {
            System.out.print("Izaberite polje (0 - 8): ");
            broj = scan.nextInt();
        }
        return broj;
    }

}
