package xDomaci20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ivana/Desktop/ITBootcamp/Selenium_driveri/chromedriver-2");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(Keys.PAGE_DOWN);
        firstName.sendKeys(Keys.PAGE_DOWN);
        firstName.sendKeys("Marko");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Jovanovic");

        WebElement gender = driver.findElement(By.cssSelector("#sex-0"));
        gender.click();

        WebElement exp = driver.findElement(By.cssSelector("#exp-6"));
        exp.click();

        WebElement datePicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
        datePicker.sendKeys("01.01.2020.");

        WebElement profession = driver.findElement(By.cssSelector("#profession-1"));
        profession.click();

        WebElement tester = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[23]/input[3]"));
        tester.click();

        Select continent = new Select(driver.findElement(By.name("continents")));
        continent.selectByVisibleText("Europe");

        Select commands = new Select(driver.findElement(By.xpath("//select[@id='selenium_commands']")));
        commands.selectByVisibleText("Switch Commands");

        WebElement uploadPhoto = driver.findElement(By.xpath("//input[@id='photo']"));
        uploadPhoto.sendKeys("/Users/ivana/Desktop/ITBootcamp/home-icon-house-real-estate-residential-symbol-vector-21679713.jpeg");

        WebElement dwnldFile = driver.findElement(By.xpath("//a[contains(text(),'Click here to Download File')]"));
        dwnldFile.click();
        Thread.sleep(5000);
        driver.navigate().back();

        WebElement button = driver.findElement(By.xpath("//button[@id='submit']"));
        button.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();

    }
}
