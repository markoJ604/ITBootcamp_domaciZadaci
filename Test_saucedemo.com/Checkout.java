package xDomaci21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Checkout {

    private static WebElement element = null;

    public static WebElement itemDesc (WebDriver driver){
        element = driver.findElement(By.id("item_4_title_link"));
        return element;
    }

    public static WebElement paymentInfo(WebDriver driver){
        element = driver.findElement(By.xpath("//div[contains(text(),'SauceCard #31337')]"));
        return element;
    }

    public static void finish (WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
        element.click();
    }

    public static WebElement tax (WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='summary_tax_label']"));
        return element;
    }
}
