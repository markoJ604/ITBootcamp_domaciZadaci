package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AccountForm {

    //String XPaths under class K

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

    public static WebElement getRepeatedPassword(WebDriver driver) {
        return driver.findElement(By.xpath(K.repeatPassXpath));
    }

    public static void inputRepeatedPassword(WebDriver driver, String password) {
       getRepeatedPassword(driver).sendKeys(password);
    }

    public static WebElement getFirstName (WebDriver driver) {
        return driver.findElement(By.xpath(K.firstNameXpath));
    }

    public static void inputFirstName (WebDriver driver, String firstname) {
        getFirstName(driver).sendKeys(firstname);
    }

    public static WebElement getLastName (WebDriver driver) {
        return driver.findElement(By.xpath(K.lastNameXpath));
    }

    public static void inputLastName (WebDriver driver, String lastname) {
        getLastName(driver).sendKeys(lastname);
    }

    public static WebElement getEMail (WebDriver driver) {
        return driver.findElement(By.xpath(K.emailXpath));
    }

    public static void inputEmail (WebDriver driver, String email) {
        getEMail(driver).sendKeys(email);
    }

    public static WebElement getPhone (WebDriver driver) {
        return driver.findElement(By.xpath(K.phoneXpath));
    }

    public static void inputPhone (WebDriver driver, String phone) {
        getPhone(driver).sendKeys(phone);
    }

    public static WebElement getAddress1 (WebDriver driver) {
        return driver.findElement(By.xpath(K.address1Xpath));
    }

    public static void inputAddress1 (WebDriver driver, String address1) {
        getAddress1(driver).sendKeys(address1);
    }

    public static WebElement getAddress2 (WebDriver driver) {
        return driver.findElement(By.xpath(K.address2Xpath));
    }

    public static void inputAddress2 (WebDriver driver, String address2) {
        getAddress2(driver).sendKeys(address2);
    }

    public static WebElement getCity (WebDriver driver) {
        return driver.findElement(By.xpath(K.cityXpath));
    }

    public static void inputCity (WebDriver driver, String city) {
        getCity(driver).sendKeys(city);
    }

    public static WebElement getState (WebDriver driver) {
        return driver.findElement(By.xpath(K.stateXpath));
    }

    public static void inputState (WebDriver driver, String state) {
        getState(driver).sendKeys(state);
    }

    public static WebElement getZip (WebDriver driver) {
        return driver.findElement(By.xpath(K.zipXpath));
    }

    public static void inputZip (WebDriver driver, String zip) {
        getZip(driver).sendKeys(zip);
    }

    public static WebElement getCountry (WebDriver driver) {
        return driver.findElement(By.xpath(K.countryXpath));
    }

    public static void inputCountry (WebDriver driver, String country) {
        getCountry(driver).sendKeys(country);
    }

    public static WebElement getLangPref (WebDriver driver) {
        return driver.findElement(By.xpath(K.langPrefXpath));
    }

    public static Select getLangPrefSelect (WebDriver driver){
        return new Select(getLangPref(driver));
    }

    public static void chooseLang (WebDriver driver, String language) {
        getLangPrefSelect(driver).selectByVisibleText(language);
    }

    public static WebElement getCategoryElement (WebDriver driver) {
        return driver.findElement(By.xpath(K.categoryXpath));
    }

    public static Select getCategorySelect (WebDriver driver){
        return new Select(getCategoryElement(driver));
    }

    public static void chooseCategory (WebDriver driver, String category) {
        getCategorySelect(driver).selectByVisibleText(category);
    }

    public static WebElement getSaveAccount (WebDriver driver){
        return driver.findElement(By.xpath(K.saveAccountXpath));
    }

    public static void clickSAveAccount (WebDriver driver){
        getSaveAccount(driver).click();
    }
}
