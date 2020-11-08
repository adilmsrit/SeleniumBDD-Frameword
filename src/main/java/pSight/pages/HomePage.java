package pSight.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pSight.DriverFactory;

public class HomePage {

    public void search(String value) {
        WebDriver driver = DriverFactory.getChromeDriver();
        WebElement search = driver.findElement(By.className("ps-nav--primary"));
        search.sendKeys(value);
        search.sendKeys(Keys.ENTER);
    }

}
