//9.A) Zadat je niz brojeva. Napisati program koji pomera sve nule na kraj niza, zadržavajući redosled nenultih
//elemenata.
//B) Zadatak odraditi tako da se ne alocira dodatni prostor za novi niz, već modifikovati postojeći.
//Primer: Ulazni niz -> 1 0 2 25 0 6, Izlaz -> 1 2 25 6 0 0

import java.util.Arrays;

public class Zadatak9 {
    public static void main(String[] args) {
        int[] niz = {1,0,0,2,25,0,6};
        int i,j=0,temp;

        for(i=0;i<niz.length;i++){
            if(niz[i]>0){
                niz[j++]=niz[i];
            }
        }
        while(j<niz.length) {
            niz[j++]=0;
        }
        System.out.println(Arrays.toString(niz));
    }
}
