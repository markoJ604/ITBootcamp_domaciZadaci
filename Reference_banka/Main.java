package Reference.Banka;
/*
Dopuniti main tako da dodaje novac na racun, ispisuje stanje tog racuna,
oduzima novac sa racuna pa ispisuje stanje racuna
Popuniti klasu Racun tako da moze da joj se postavi i dohvati osoba.
Osoba mora da se postavi prilikom kreiranja racuna a moze se naknadno promeniti
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banka b = new Banka("Demokratska banka");
        Osoba o1=new Osoba("Pera","Peric",1997);
        Racun r1 = b.otvoriRacun(o1);

        System.out.println(o1.getRacun().getBrojRacuna());

        Scanner in = new Scanner(System.in);
        System.out.println("Unesi kolicinu novca koju ubacujes na racun:");
        int unos = in.nextInt();
        r1.dodajNovac(unos);
        System.out.println(r1.getStanje());
        System.out.println("Unesi kolicinu novca koju zelis da skines sa racuna:");
        unos=in.nextInt();
        r1.oduzmiNovac(unos);
        System.out.println(o1.getRacun().getStanje());

        Racun r2 = new Racun((o1.getIme()+"-"+o1.getPrezime()+o1.getGodRodjenja()), (o1.getIme()+" "+o1.getPrezime()));
        System.out.println(r2.getBrojRacuna());

    }
}
