//10.Za zadati niz String-ova ispisati da li niz sadrži iste Stringove dva ili više puta.

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        String[] niz = {"marko","milos","pera","zdera","marko","pera","milica","marko"};
        for(int i=0;i<niz.length;i++){
//            System.out.println("i je "+i);
            for(int j=i+1;j<niz.length;j++){
//                System.out.println("j je "+j);
                if(niz[i].equals(niz[j])){
//                    System.out.println(niz[j]);
                    sum+=1;
                }
            }
        }
        if(sum>1) System.out.println(String.format("Ovaj niz sadrzi %d duplikata reci.",sum));
        if(sum==1) System.out.println("Ovaj niz sadrzi jedan duplikat reci.");
        if(sum<1) System.out.println("U ovom nizu se ne ponavljaju reci.");
    }
}
