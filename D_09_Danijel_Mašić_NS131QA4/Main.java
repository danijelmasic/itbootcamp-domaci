import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] sastojci1 = {"Kafa", "Mleko", "Secer"};
        String[] sastojci2 = {"Kafa", "Mleko", "Secer"};
        String[] sastojci3 = {"Kafa", "Mleko", "Secer"};
        String[] sastojci4 = {"Kafa", "Mleko", "Secer"};
        String[] sastojci5 = {"Kafa", "Mleko", "Secer"};
         Kafa kafa1 = new Kafa("Espreso", "Veliki", sastojci1, 420);
         Kafa kafa2 = new Kafa("Bonito", "100g", sastojci2, 120);
         Kafa kafa3 = new Kafa("Grand", "100g", sastojci3, 140);
         Kafa kafa4 = new Kafa("C Kafa", "200g", sastojci4, 240);
         Kafa kafa5 = new Kafa("Nes", "200g", sastojci5, 250);

        List<Kafa> kafe1 = new ArrayList<>();
        kafe1.add(kafa1);
        kafe1.add(kafa2);
        kafe1.add(kafa3);
        List<Kafa> kafe2 = new ArrayList<>();
        kafe2.add(kafa4);
        kafe2.add(kafa5);

        Prodavnica prodavnica1 = new Prodavnica(kafe1, "Danila Kisa 32");
        Prodavnica prodavnica2 = new Prodavnica(kafe2, "Trg slobode 39");

        System.out.println(Prodavnica.getBrojProdavnica());

        /*U prodavnici1 kupite kafu nes kolicinu 2
           U prodavnici 2 kupite neku kafu kolicine 1
            U  prodavnici 2 onovo kupite kafu kolicine 3*/

        prodavnica1.kupiKafu(kafa5, 2);
        prodavnica2.kupiKafu(kafa1, 1);
        prodavnica2.kupiKafu(kafa1, 3);

        List<Prodavnica> prodavnice = new ArrayList<>();
        prodavnice.add(prodavnica1);
        prodavnice.add(prodavnica2);

        Prodavnica najuspesnija = Prodavnica.najuspesnijaProdavnica(prodavnice);
        System.out.println("Najuspesnija prodavnica je: " + najuspesnija.toString());
        System.out.println("Kafe pre popusta:" + najuspesnija.getKafe());

        najuspesnija.popust(20);

        System.out.println("Kafe posle popusta:" + najuspesnija.getKafe());




    }
}
