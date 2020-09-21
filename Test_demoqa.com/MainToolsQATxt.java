package SeleniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainToolsQATxt {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ivana/Desktop/ITBootcamp/Selenium_driveri/chromedriver-2");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/text-box");

        WebElement txtFullName = driver.findElement(By.xpath("//input[@id='userName']"));
        txtFullName.sendKeys("Pera String");
        WebElement eMail = driver.findElement(By.cssSelector("#userEmail"));
        eMail.sendKeys("marko@abc.com");
        /*
         // Ubaciti mejl preko css selektora
        // ubaciti adresu pomocu relativnog xPath-a
        // Ubaciti Trajnu adresu preko absolutnog xPath-a
         */
        WebElement adresa = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        adresa.sendKeys("Savska 2");
        WebElement trajnaAdresa = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[4]/div[2]/textarea[1]"));
        trajnaAdresa.sendKeys("Sarajevska 3");


        WebElement submit = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/form[1]/div[5]/div[1]/button[1]"));
        submit.sendKeys(Keys.ARROW_DOWN);
        submit.sendKeys(Keys.ARROW_DOWN);

        submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
