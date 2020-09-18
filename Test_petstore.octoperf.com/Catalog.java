package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Catalog {

    private static String signInXpath = "//a[contains(text(),'Sign In')]";

    public static WebElement getSignIn(WebDriver driver) {
        return driver.findElement(By.xpath(signInXpath));
    }

    public static void clickSignIn(WebDriver driver) {
        getSignIn(driver).click();
    }

    
}
