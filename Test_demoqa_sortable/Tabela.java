package xDomaci23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
Na stranici https://demoqa.com/webtables :
- obrisati 2 od 3 postojece tabele
- preostalu tabelu editovati sa random parametrima
- napraviti jednu tabelu sa svojim random parametrima

 */
public class Tabela {
    private static String row1Xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[2]/*[local-name()='svg'][1]/*[name()='path'][1]";
    private static String row2Xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[7]/div[1]/span[2]/*[local-name()='svg'][1]/*[name()='path'][1]";
    private static String editRow1Xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[local-name()='svg'][1]/*[name()='path'][1]";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver-2");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        clickRow1Del(driver);
        clickRowDel2(driver);
        clickRow1Edit(driver);
        editName(driver,"Marko");
        clickSubmit(driver);
        clickAddNew(driver);
        editName(driver, "Marko");
        editLastName(driver, "Jovanovic");
        editEmail(driver, "marko@abc.com");
        editAge(driver, "35");
        editSalary(driver, "100000");
        editDepartment(driver, "Geotehnika");
        clickSubmit(driver);

    }


    public static void clickRow1Del(WebDriver driver){
        driver.findElement(By.xpath(row1Xpath)).click();
    }

    public static void clickRowDel2 (WebDriver driver){
        driver.findElement(By.xpath(row2Xpath)).click();
    }

    public static void clickRow1Edit (WebDriver driver){
        driver.findElement(By.xpath(editRow1Xpath)).click();
    }

    public static void editName (WebDriver driver, String name){
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys(name);
    }
    public static void editLastName (WebDriver driver, String name){
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys(name);
    }
    public static void editEmail (WebDriver driver, String name){
        driver.findElement(By.id("userEmail")).clear();
        driver.findElement(By.id("userEmail")).sendKeys(name);
    }
    public static void editAge (WebDriver driver, String name){
        driver.findElement(By.id("age")).clear();
        driver.findElement(By.id("age")).sendKeys(name);
    }
    public static void editSalary (WebDriver driver, String name){
        driver.findElement(By.id("salary")).clear();
        driver.findElement(By.id("salary")).sendKeys(name);
    }
    public static void editDepartment (WebDriver driver, String name){
        driver.findElement(By.id("department")).clear();
        driver.findElement(By.id("department")).sendKeys(name);
    }

    public static void clickSubmit (WebDriver driver){
        driver.findElement(By.id("submit")).click();
    }
    public static void clickAddNew (WebDriver driver){
        driver.findElement(By.id("addNewRecordButton")).click();
    }


}
