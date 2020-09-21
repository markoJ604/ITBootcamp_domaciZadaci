package SeleniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragTest {
    public static void main(String[] args) {
        String url = "https://demoqa.com/dragabble";
        System.setProperty("webdriver.chrome.driver", "chromedriver-2");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement drag = driver.findElement(By.xpath("//div[@id='dragBox']"));

        Actions action = new Actions(driver);
        action.dragAndDropBy(drag, 50,50);
        action.perform();
    }
}
