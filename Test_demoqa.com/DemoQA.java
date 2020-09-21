package SeleniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQA {
    public static void main(String[] args) {

        /*
        First Name, Last Name Mail Mobile Subjects Current Address
         */

        System.setProperty("webdriver.chrome.driver", "/Users/ivana/Desktop/ITBootcamp/Selenium_driveri/chromedriver-2");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        txtFirstName.sendKeys("Marko");
        WebElement txtLastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        txtLastName.sendKeys("Jovanovic");
        WebElement eMail = driver.findElement(By.cssSelector("#userEmail"));
        eMail.sendKeys("marko@abc.com");
        WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
        gender.click();
        WebElement txtMobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
        txtMobile.sendKeys("0600000001");

        String shadySelectXpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]";
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.xpath(shadySelectXpath))).sendKeys("M").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
        action.perform();

        WebElement adresa = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        adresa.sendKeys(Keys.ARROW_DOWN);
        adresa.sendKeys("Savska 2");

        WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[11]/div[1]/button[1]"));
        submit.sendKeys(Keys.PAGE_DOWN);

        submit.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
