package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccount {

    private static String registerNowXpath = "//a[contains(text(),'Register Now!')]";
    private static String signOnXpath = "//input[@name='signon']";


    public static WebElement getRegisterNow (WebDriver driver){
        return driver.findElement(By.xpath(registerNowXpath));
    }
    public static void clickRegisterNow (WebDriver driver){
        getRegisterNow(driver).click();
    }

    public static WebElement getUserName (WebDriver driver){
        return driver.findElement(By.name(K.userName));
    }

    public static void inputUserName(WebDriver driver, String username) {
        getUserName(driver).sendKeys(username);
    }

    public static WebElement getPassword(WebDriver driver) {
        return driver.findElement(By.name(K.getPasswordName));
    }

    public static void inputPassword(WebDriver driver, String password) {
        getPassword(driver).sendKeys(password);
    }

    public static WebElement getSignOn (WebDriver driver){
        return driver.findElement(By.xpath(signOnXpath));
    }
    public static void clickSignOn (WebDriver driver){
        getSignOn(driver).click();
    }
}
