//3. Za zadati ceo broj odrediti da li je on stepen broja 3.

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Unesi ceo broj:");
        int broj = in.nextInt();

        while(broj>3){
            if(broj%3==0){
                broj=broj/3;
                if(broj<3) break;
                continue;
            } else {
                System.out.println("Ovaj broj nije stepen broja 3.");
                System.exit(0);
            }
        }
        if(broj<3){
            System.out.println("Ovaj broj nije stepen broja 3.");
        } else {
            System.out.println("Ovaj broj je stepen broja 3.");
        }
    }
}
