package xDomaci21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Payment {

    private static WebElement element = null;

    public static void checkoutButton (WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
        element.click();
    }

    public static WebElement firstName (WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/div[1]/form[1]/div[1]/input[1]"));
        return element;
    }

    public static WebElement lastName (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='last-name']"));
        return element;
    }

    public static WebElement postalCode (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='postal-code']"));
        return element;
    }

    public static void continueOn (WebDriver driver){
        element = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
        element.click();
    }

}
