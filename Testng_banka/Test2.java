package TestNG_A.ZadatakA;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
Zadatak 2
Potrebno je napraviti test za ispravnost klase Bank.
Za sve testove potrebno je napraviti jedinstvenu banku koja se na
početku testa resetuje. Smatrati da ova banka ne može da ima nalog kod kojeg
je stanje negativno. Ako se na osnovu testova nađe neka greška u kodu potrebno
jej da se popravi originalni kod.

Potrebno je ispitati da li adekvatno radi otvaranje naloga, tako što će se ubaciti
5 naloga i zatim ispitati da li se ti nalozi mogu dohvatiti.
Proveriti da li dobro radi metoda za uplatu novca.
Proveriti da li dobro radi metoda za transfer novca.
Proveriti da li dobro radi metoda za računanje ukupnog novca u banci (getSumMoney).
 */
public class Test2 {

    private Bank b1;
    private Bank mobi1;

    @BeforeClass

    public void init(){
        mobi1 = new Bank();
        b1 = new Bank();

    }
    @BeforeMethod

    public void ispravnostBanke(){
        mobi1.reset();
    }

    @Test

    public void ispravnostNaloga(){

        Account a1 = b1.openAccount("Racun1");
        Account a2 = b1.openAccount("Racun2");
        Account a3 = b1.openAccount("Racun3");
        Account a4 = b1.openAccount("Racun4");
        Account a5 = b1.openAccount("Racun5");

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(b1.getAccount(a1.getNumber()),a1);
        sa.assertEquals(b1.getAccount(a2.getNumber()),a2);
        sa.assertEquals(b1.getAccount(a3.getNumber()),a3);
        sa.assertEquals(b1.getAccount(a4.getNumber()),a4);
        sa.assertEquals(b1.getAccount(a5.getNumber()),a5);

        sa.assertAll();

    }

    @Test

    public void proveraTransfera(){
        Account marko = mobi1.openAccount("Marko");
        mobi1.payInMoney(marko.getNumber(), 1000.00);
        Account pera = mobi1.openAccount("Pera");
        mobi1.transferMoney(marko.getNumber(),pera.getNumber(),200.00);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(marko.getAmount(), 800.00);
        sa.assertEquals(pera.getAmount(),200.00);

        sa.assertAll();

    }

    @Test

    public void uplataNovca(){
        Account a1 = b1.openAccount("Racun1");
        b1.payInMoney(a1.getNumber(),1000.00);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(a1.getAmount(),1000.00);
        sa.assertAll();

    }

    @Test
    public void sumaNovca(){
        Account a1 = b1.openAccount("Racun1");
        Account a2 = b1.openAccount("Racun2");
        Account a3 = b1.openAccount("Racun3");
        Account a4 = b1.openAccount("Racun4");
        Account a5 = b1.openAccount("Racun5");

        a1.setAmount(1000.00);
        a2.setAmount(2000.00);
        a3.setAmount(1500.00);
        a4.setAmount(4000.00);
        a5.setAmount(10000.00);

        SoftAssert sa = new SoftAssert();
        sa.assertEquals(b1.getSumMoney(),a1.getAmount()+a2.getAmount()+a3.getAmount()+a4.getAmount()+a5.getAmount());
    }
}
