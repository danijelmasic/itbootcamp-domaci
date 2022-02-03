package Domaci10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Proizvod p1 = new Prehrambeni("475sdi7","mleko",100,
                LocalDate.of(2021,12,30));
        Proizvod p2 = new Tehnika("345kh3","sporet",35000,5,40);
        Proizvod p3 = new
                AlkoholnaPica("654k33","pivo",120,"staklena",10);
        Proizvod p4 = new Pice("774gg","sok breskva",200,"kartonska");

        List<Proizvod> nizProizvoda = new ArrayList<>();
        nizProizvoda.add(p1);
        nizProizvoda.add(p2);
        nizProizvoda.add(p3);
        nizProizvoda.add(p4);

        for(Proizvod proizvod : nizProizvoda){
            if(proizvod.getCena() > 200){
                proizvod.setPopust(15);
            }
            if(proizvod instanceof AlkoholnaPica){
                proizvod.setPopust(50);
            }
        }
        for(Proizvod proizvod : nizProizvoda){
            proizvod.poruci(1);
            System.out.println(proizvod);
        }
    }



}
