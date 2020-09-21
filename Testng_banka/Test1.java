package TestNG_A.ZadatakA;
/*
Potrebno je napraviti test za ispravnost klase Account. Ako se na osnovu testova pronađe neka
greška u kodu potrebno je da se popravi originalni kod.

Proveriti da li konstruktor public Account(String name, String number) dobro postavlja argumente,
kao i da li get metode vraćaju odgovarajuće vrednosti. Kada se napravi račun, stanje treba da bude
jednako 0.

 */

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test1 {

    @Test

    public void metoda1() {
        Account a1 = new Account("Marko", "242342");
        Account a2 = new Account("Milos");
        Account a23 = new Account("MEEE");

        SoftAssert sa = new SoftAssert();

        sa.assertEquals(a1.getNumber(), "242342");
        sa.assertEquals(a1.getName(), "Marko");
        sa.assertEquals(a2.getAmount(), 0.0);
        String ocekivanje = String.format("%s %s %.2f", a1.getNumber(), a1.getName(), a1.getAmount());
        sa.assertEquals(a1.toString(), ocekivanje);

        a2.setAmount(50.00);

        sa.assertEquals(a2.getAmount(), 50.00);

        Bank b1 = new Bank();
        Account a34 = b1.openAccount("Uros");
        sa.assertEquals(b1.getAccount(a34.getNumber()), a34);
        sa.assertAll();
    }

//    @Test
//
//    public void RacunJeJednak() {
//        Bank b1 = new Bank();
//        int max = 100;
//        for (int i = 0; i <= max; i++) {
//            b1.openAccount("Tester" + i);
//        }
//        for (int i = 0; i <= max; i++) {
//            for (int j = i + 1; j <= max; j++) {
//                Assert.assertEquals(b1.accounts.get(i).getNumber().
//                        equals(b1.accounts.get(j).getNumber()), false);
//            }
//        }
//    }

    @Test

    public void generisanjeAccounta() {
        int max = 100;
        Account[] racuni = new Account[max];
        for (int i = 0; i < racuni.length; i++) {
            racuni[i] = new Account("Tester" + i);
        }
        for (int i = 0; i < racuni.length; i++) {
            for (int j = i + 1; j < racuni.length; j++) {
                Assert.assertNotEquals(racuni[i].getNumber(),racuni[j].getNumber());
            }
        }


    }

}


