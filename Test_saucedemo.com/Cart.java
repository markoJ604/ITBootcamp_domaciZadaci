package xDomaci21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Cart {

    private static WebElement element = null;

    public static Select sort(WebDriver driver) {
        element = driver.findElement(By.className("product_sort_container"));
        Select sort = new Select(element);
        return sort;
    }

    public static void product(WebDriver driver) {
        element = driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]"));
        element.click();
    }

    public static void goToCart(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[name()='path' and contains(@fill,'currentCol')]"));
        element.click();
    }


}
