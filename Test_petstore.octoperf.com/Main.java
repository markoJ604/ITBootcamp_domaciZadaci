package PageObjectModel;

import TestNG_A.ZadatakA.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "chromedriver-2");
        WebDriver driver = new ChromeDriver();
        driver.get(Home.url);

        Home.clickEnterTheStore(driver);

        Catalog.clickSignIn(driver);

        //After initial register, comment out next lines of code: 20-39

//        NewAccount.clickRegisterNow(driver);
//
//        AccountForm.inputUserName(driver,"marko");
//        AccountForm.inputPassword(driver,"marko");
//        AccountForm.inputRepeatedPassword(driver, "marko");
//        AccountForm.inputFirstName(driver, "Marko");
//        AccountForm.inputLastName(driver, "Jovanovic");
//        AccountForm.inputEmail(driver, "marko@abc.com");
//        AccountForm.inputPhone(driver, "0600000000");
//        AccountForm.inputAddress1(driver, "Nekaadresa1");
//        AccountForm.inputAddress2(driver, "Nekaadresa2");
//        AccountForm.inputCity(driver, "BG");
//        AccountForm.inputState(driver, "SRB");
//        AccountForm.inputZip(driver, "11000");
//        AccountForm.inputCountry(driver, "SRB");
//        AccountForm.chooseLang(driver, "english");
//        AccountForm.chooseCategory(driver, "DOGS");
//        AccountForm.clickSAveAccount(driver);
//
//        Catalog.clickSignIn(driver);

        NewAccount.inputUserName(driver, "marko");
        NewAccount.getPassword(driver).clear();
        NewAccount.inputPassword(driver,"marko");
        NewAccount.clickSignOn(driver);


    }
}
