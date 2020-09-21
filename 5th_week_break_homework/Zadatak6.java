//6.Zadati su jedan niz celih brojeva, i jedan broj koji prestavlja ‘metu’. Napisati program koji vraća
// indekse dva broja koja kada se saberu daju rezultat jednak unetoj ‘meti’.
//Pretpostaviti da će svaki ulazni podaci imati tačno jedno rešenje. Ne koristiti jedan element više puta.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n,j;
        ArrayList indeksi = new ArrayList();

        int[] niz = new int[6];
        //ucitaj elemente prvog niza
        for(i=0;i<6;i++){
            System.out.println("Ucitaj elemente niza:");
            niz[i]=in.nextInt();
        }
        System.out.println("Elementi niza su: "+ Arrays.toString(niz));
        System.out.println("Unesi metu sabiranja:");
        n=in.nextInt();

        for(i=0;i<6;i++){
            for(j=0;j<6;j++){
                if(niz[i]+niz[j]==n){
                    indeksi.add(i);
                }
            }
        }
        Object[] array = indeksi.toArray();
        System.out.println("Indeksi u nizu koji sabiranjem daju zadatu metu su: "+Arrays.toString(array));
    }
}
