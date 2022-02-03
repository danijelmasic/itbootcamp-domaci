import java.util.Scanner;

public class MojIksOks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Izaberite svoj znak (x ili o): ");
        String igracZnak = scan.nextLine().toLowerCase();
        String racunarZnak = " ";
        String[] tabla = new String[9];

        if (igracZnak.equals("x")) {
            racunarZnak = "o";
        } else if (igracZnak.equals("o")) {
            racunarZnak = "x";
        } else {
            System.out.println("Molim izaberite validan znak (x ili o)");
            return;
        }

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
        for (int j = 0; j < tabla.length - 4; j++) {
            System.out.println();
            int polje;
            do {
                System.out.println("Izaberite polje (0 - 8): ");
                polje = scan.nextInt();
            } while (tabla[polje] != null);

            tabla[polje] = igracZnak;
            if (j == 4) {
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
                break;
            }

            int n;
            do{
                n = (int) Math.abs(Math.floor(Math.random() * 10 - 1));

            }while(tabla[n] != null);
            tabla[n] = racunarZnak;

            for(int i = 0; i < tabla.length; i++){

                if(i == 3){
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
        }
    }
