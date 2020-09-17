package xDomaci21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Checkout {

    private static WebElement element = null;

    public static Select sort(WebDriver driver) {
        element = driver.findElement(By.className("product_sort_container"));
        Select sort = new Select(element);
        return sort;
    }

    public static WebElement paymentInfo(WebDriver driver){
        element = driver.findElement(By.xpath("//div[contains(text(),'SauceCard #31337')]"));
        return element;
    }

    public static void finish (WebDriver driver) {
        element = driver.findElement(By.xpath("//a[@class='btn_action cart_button']"));
        element.click();
    }


}
