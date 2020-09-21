package xDomaci23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class ELements {

    private static WebElement element = null;
    private static final String oneXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'One')]";
    private static final String twoXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Two')]";
    private static final String threeXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Three')]";
    private static final String fourXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Four')]";
    private static final String fiveXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Five')]";
    private static final String sixXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Six')]";
    private static final String sevenXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Seven')]";
    private static final String eightXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Eight')]";
    private static final String nineXpath = "//div[@class='create-grid']//div[@class='list-group-item list-group-item-action'][contains(text(),'Nine')]";

    public static void clickGrid (WebDriver driver){
        driver.findElement(By.xpath("//a[@id='demo-tab-grid']")).click();
    }


    public static void move1 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(oneXpath)), x,y);
        action.perform();
    }
    public static void move2 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(twoXpath)), x,y);
        action.perform();
    }
    public static void move3 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(threeXpath)), x,y);
        action.perform();
    }
    public static void move4 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(fourXpath)), x,y);
        action.perform();
    }
    public static void move5 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(fiveXpath)), x,y);
        action.perform();
    }
    public static void move6 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(sixXpath)), x,y);
        action.perform();
    }
    public static void move7 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(sevenXpath)), x,y);
        action.perform();
    }
    public static void move8 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(eightXpath)), x,y);
        action.perform();
    }
    public static void move9 (WebDriver driver, int x, int y) {
        Actions action = new Actions(driver);
        action.dragAndDropBy(driver.findElement(By.xpath(nineXpath)), x,y);
        action.perform();
    }

}
