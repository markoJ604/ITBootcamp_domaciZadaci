package xDomaci14;/*
1. Napraviti sistem klasa koji opisuje knjigu.
Autor poseduje ime, prezime, godinu rodjenja.
Ime, prezime i godina rodjenja se zadaju prilikom kreiranja
i ne mogu da se promene.

Knjiga poseduje naziv, AUTORA (TIPA Autor),
broj strana, godinu izdanja.
Sva polja mogu da se dohvate,
a godina izdanja moze i da se postavi

U programu iskoristi sva polja iz svih kreiranih klasa gde ce se kreirati 3 knjige, a knjige biti poredjane po godini izdanja.

2. Dopuniti deo zadataka koji smo radili na predavanju a Dusan zadao da se uradi za domaci.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Knjiga>biblioteka = new ArrayList<>();

        Autor autor1 = new Autor("Brandon", "Sanderson", 1974);

        Knjiga knjiga1 = new Knjiga("The Way of Kings", autor1, 1029, 2022);
//        knjiga1.setGodIzdanja(2011);

        Knjiga knjiga2 = new Knjiga("Words of Radiance", autor1, 1340, 2014);
        Knjiga knjiga3 = new Knjiga("Oathbringer", autor1, 1294, 2018);

        knjiga1.dodajKnjigu(knjiga1);
        knjiga2.dodajKnjigu(knjiga2);
        knjiga3.dodajKnjigu(knjiga3);


        Knjiga.sort();

//        System.out.println(knjiga1);
    }
}
