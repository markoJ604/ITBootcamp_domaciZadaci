//11.Za zadat niz koji sadrži n različitih brojeva uzetih iz skupa 0, 1, 2, ..., n pronaći
//jedan koji u tom nizu nedostaje.
//Primeri: Ulaz: [3,1,0], Izlaz: 2
//Ulaz: [4,2,3,5,7,0,1], Izlaz: 6

public class Zadatak11 {
    public static void main(String[] args) {
        int[] niz = {3,5,1,2,6};
        int n,sum;
        n=niz.length+1;
        sum=(n*(n+1))/2;

        for(int i=0;i<niz.length;i++){
            sum=sum-niz[i];
        }
        System.out.println(sum);
    }


}
