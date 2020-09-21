//4.Napisati program koji učita dva niza i kao rezultat kreira treći niz koji predstavlja presek učitanih nizova.
//Ispisati rezultat u formatu ‘( element * element * element * ... element).’

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j;
        ArrayList niz3 = new ArrayList();
        int niz3broj = 0;

        int[] niz = new int[6];
        //ucitaj elemente prvog niza
        for(i=0;i<6;i++){
            System.out.println("Ucitaj elemente prvog niza:");
            niz[i]=in.nextInt();
        }
        System.out.println("Elementi prvog niza su: "+ Arrays.toString(niz));

        int[] niz2 = new int[6];
        //ucitaj elemente drugog niza
        for(i=0;i<6;i++){
            System.out.println("Ucitaj elemente drugog niza:");
            niz2[i]=in.nextInt();
        }
        System.out.println("Elementi drugog niza su: "+ Arrays.toString(niz2));

        for(i=0;i<6;i++) {
            for (j = 0; j < 6; j++) {
                if (niz[i] == niz2[j]) {
                    niz3broj = niz[i];
                    niz3.add(niz3broj);
                }
            }
        }
        Object[] array = niz3.toArray();
        System.out.print("Presek unetih nizova je: ( ");
        for(i=0;i<array.length;i++){
            System.out.print(array[i]);
            if (i!=array.length-1) System.out.print(" * ");
        }
        System.out.print(" )");
    }
}
//
//    int[] niz1 = {0, 2, 3, 4, 5};
//    int[] niz2 = {0, 3, 5, 7};
//    int[] niz3 = {0, 0, 0, 0, 0};
//
//        for (int i = 0; i < niz1.length; i++) {
//        for (int j = 0; j < niz2.length; j++) {
//
//        if (niz1[i] == niz2[j]) {
//        niz3[i] = niz2[j];
//        System.out.print(niz3[i]);
//        if (i != niz3.length - 1) System.out.print("*");
//        }
//        }
//        } 