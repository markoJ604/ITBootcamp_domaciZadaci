package xDomaci23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver-2");// Putanja do chrome drivera
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/sortable");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        ELements.clickGrid(driver);
        ELements.move1(driver, 200, 220);
        ELements.move2(driver, 140, 220);
        ELements.move3(driver, 0, 220);
        ELements.move4(driver, 200, 130);
        ELements.move5(driver, 140, 130);
        ELements.move6(driver, 0, 130);
        ELements.move7(driver, 200, 0);
        ELements.move8(driver, 140, 0);
    }


}
