package RadSaTabelama;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Vezba {
    public static void main(String[] args) {

        XSSFWorkbook wb;
        FileInputStream fis;
        System.setProperty("webdriver.chrome.driver", "/Users/ivana/Desktop/ITBootcamp/Selenium_driveri/chromedriver-2");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        try {
            fis = new FileInputStream("/Users/ivana/Desktop/ITBootcamp/vezbaUnos.xlsx");
            wb = new XSSFWorkbook(fis);

            Sheet sheet = wb.getSheetAt(0);
            for (int i = 1; i < 6; i++) {
                Row row = sheet.getRow(i);
                Cell cell = row.getCell(0);
                WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
                txtFirstName.sendKeys(cell.toString());

                cell = row.getCell(1);
                WebElement txtLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
                txtLastName.sendKeys(cell.toString());

                cell = row.getCell(2);
                WebElement eMail = driver.findElement(By.cssSelector("#userEmail"));
                eMail.sendKeys(cell.toString());

                cell = row.getCell(4);
                WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'" + cell.toString() + "')]"));
                gender.click();

                cell = row.getCell(3);
                WebElement txtMobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
                txtMobile.sendKeys(cell.toString());

                WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[11]/div[1]/button[1]"));
                submit.sendKeys(Keys.PAGE_DOWN);

                submit.click();

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                WebElement close = driver.findElement(By.xpath("//button[@id='closeLargeModal']"));
                close.click();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
