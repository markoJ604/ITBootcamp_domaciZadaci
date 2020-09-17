package xDomaci21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement element = null;

    public static WebElement username(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='user-name']"));
        return element;
    }

    public static WebElement password(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='password']"));
        return element;
    }

    public static void login(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@id='login-button']"));
        element.click();
    }
}
