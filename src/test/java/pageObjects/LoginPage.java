package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class LoginPage {

    public WebDriver webDriver;
    WebDriverWait webDriverWait;

    public LoginPage(WebDriver rdriver) {
        webDriver = rdriver;
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.manage().window().maximize();
        PageFactory.initElements(webDriver, this);
    }


    @FindBy(id = "Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id = "Password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(xpath = "//input[@value='Log in']")
    @CacheLookup
    WebElement btnLogin;

    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnkLogout;

    public LoginPage setUsername(String username) {
        txtEmail.clear();
        txtEmail.sendKeys(username);
        return this;
    }


    public LoginPage setPassword(String password) {
        txtPassword.clear();
        txtPassword.sendKeys(password);
        return this;
    }

    public LoginPage clickLogin(){
        btnLogin.click();
        return this;
    }

    public LoginPage clickLogout(){
        lnkLogout.click();
        return this;
    }


    public String getPageTitle(){
        return webDriver.getTitle();
    }



}
