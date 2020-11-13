package StepDefenitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pSight.DriverFactory;
import pageObjects.LoginPage;

public class MyStepdefs {

    public WebDriver driver;
    LoginPage loginPage;

    @Given("User launches chrome browser")
    public void user_launches_chrome_browser() {
        driver = DriverFactory.getChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @When("User opens {string} URL")
    public void user_opens_url(String url) {
        driver.get(url);
    }

    @When("User enters {string} and password as {string}")
    public void user_enters_and_password_as(String username, String password) {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
    }

    @When("Click on Login")
    public void click_on_login() {
        loginPage.clickLogin();
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String string) {
        Assert.assertEquals(string, loginPage.getPageTitle());
    }

    @When("User clicks on logout link")
    public void user_clicks_on_logout_link() {
        loginPage.clickLogout();
    }

    @Then("Close Browser")
    public void close_browser() {
        driver.quit();
    }

}
