//7.Lakša varijanta: Napisati program koji vraća niz karaktera u obrnutom redosledu. Ulaz je niz char-ova
//Teža varijanta: Zadatak odraditi tako da se ne alocira dodatni prostor, već modifikuje ulazni niz.


import java.util.Arrays;
import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0;
        char temp;
        char[] niz = new char[5];

        System.out.println("Unesi nekoliko karaktera:");
        for(i=0;i<5;i++){
            niz[i]=in.next().charAt(0);
            System.out.println(Arrays.toString(niz));
        }

        i=0;
        int j=niz.length-1;

        while(i<j){
            temp=niz[i];
            niz[i]=niz[j];
            niz[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(niz));
    }
}
