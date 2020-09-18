package xDomaci21;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    private static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ivana/Desktop/ITBootcamp/Selenium_driveri/chromedriver-2");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        XSSFWorkbook wb;
        FileInputStream fis;

        try {
            fis = new FileInputStream("/Users/ivana/Desktop/ITBootcamp/Domaci21.xlsx");
            wb = new XSSFWorkbook(fis);

            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.getRow(1);
            //Za drugog usera promeni index u getRow(>2<)
            Cell username = row.getCell(0);
            Cell password = row.getCell(1);
            Cell firstName = row.getCell(2);
            Cell lastName = row.getCell(3);
            Cell postalCode = row.getCell(4);
            Cell productInfo = row.getCell(5);
            Cell taxInfo = row.getCell(6);
            Cell paymentInfo = row.getCell(7);

            //LOGIN

            LoginPage.username(driver).sendKeys(username.toString());
            LoginPage.password(driver).sendKeys(password.toString());
            LoginPage.login(driver);
            Thread.sleep(2000);

            //CART

            Cart.sort(driver).selectByVisibleText("Price (low to high)");
            Thread.sleep(1000);

            Cart.product(driver);
            Thread.sleep(1000);

            Cart.goToCart(driver);
            Thread.sleep(1000);

            //PAYMENT

            Payment.checkoutButton(driver);
            Thread.sleep(1000);

            Payment.firstName(driver).sendKeys(firstName.toString());
            Payment.lastName(driver).sendKeys(lastName.toString());
            Payment.postalCode(driver).sendKeys(postalCode.toString());
            Payment.continueOn(driver);

            //CHECKOUT

            if (!Checkout.itemDesc(driver).getText().equals(productInfo.getStringCellValue())) System.exit(27);
            if (!Checkout.tax(driver).getText().equals(taxInfo.getStringCellValue())) System.exit(28);
            if (!Checkout.paymentInfo(driver).getText().equals(paymentInfo.getStringCellValue())) System.exit(29);

            Checkout.finish(driver);
            driver.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Nije proslo");
        }
    }


}
