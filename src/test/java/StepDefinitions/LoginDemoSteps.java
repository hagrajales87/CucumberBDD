package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


@Slf4j
public class LoginDemoSteps {
/*
    private WebDriver driver;
    private WebDriverWait wait;
    private By loginField = By.id("name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login");
    private By logoutButton = By.id("logout");


    @Given("browser is open")
    public void browser_is_open() {
        log.info("Inside Step - browser is open");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginField));
        driver.findElement(loginField).sendKeys(username);
        wait.until(ExpectedConditions.presenceOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);

    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.presenceOfElementLocated(loginButton));
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.presenceOfElementLocated(logoutButton));
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        driver.findElement(logoutButton).isDisplayed();
    }

 */
}
