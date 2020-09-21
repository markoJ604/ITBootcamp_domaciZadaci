//1.
//A) Učitati jedan broj i ispisati koliko on sadrži cifara koje su deljive sa 3.
//B) Modifikovati program tako da se postupak pod a) ponavlja i to tako da pre svakog unosa korisnik vidi
//pitanje da li želi da unese još jedan broj. Ako je odgovor 'da' treba izbrojati cifre deljive sa 3, a ukoliko je 'ne'
//treba završiti program.
//C) Omogućiti da unos reči 'da' i 'ne' ne bude caseSensitive.

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count;
        int cifra;
        String odgovor1 = "DA", odgovor2="NE";
        Scanner unos = new Scanner(System.in);
        String odgovor;
        
        while(true) {
            count=0;
            System.out.println("Ucitaj jedan broj:");
            int broj = in.nextInt();
                while (broj > 0) {
                    cifra = broj % 10;
                    if (cifra % 3 == 0) count++;
                    broj = broj / 10;
                }
            System.out.println(String.format("Ovaj broj ima %d cifara deljivih sa tri. ", count));
            System.out.println("Da li zelis da uneses jos jedan broj?");
            odgovor = unos.nextLine();
            if (odgovor.equalsIgnoreCase(odgovor1)) {
                continue;
            } else {
                break;
            }
        }
    }
}
