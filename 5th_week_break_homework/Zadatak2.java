//2.
//Zadat je nenegativan broj. Sabirati njegove cifre sve dok rezultat ne bude samo jedna cifra. Ispisati je.

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, zbir=0;
        int cifra = 0;

            System.out.println("Ucitaj jedan nenegativan broj:");
            int broj = in.nextInt();
            while(i<100) {
//                System.out.println("Nova iteracija");
//                System.out.println(broj);
                while (broj > 0) {
                    cifra = broj % 10;
                    broj = broj / 10;
//                    System.out.println("Cifra je "+cifra);
                    zbir += cifra;
//                    System.out.println("Zbir cifara ovog broja do jedne cifre je: "+zbir);
//                    System.out.println("Broj je "+broj);
                }
                if (zbir >= 10) {
                    broj = zbir;
//                    System.out.println("Novi broj je "+broj);
                    zbir=0;
                } else {
                    break;
                }
                i++;
            }
        System.out.println("Zbir cifara ovog broja do jedne cifre je: "+zbir);

    }
}
