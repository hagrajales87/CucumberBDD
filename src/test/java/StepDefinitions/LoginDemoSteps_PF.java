package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageFactory.HomePage_PF;
import pageFactory.LoginPage_PF;

@Slf4j
public class LoginDemoSteps_PF {

    private WebDriver driver;
    private WebDriverWait wait;
    private LoginPage_PF loginPage_pf;
    private HomePage_PF homePage_pf;

    @Given("browser is open")
    public void browser_is_open() {
        log.info(" === I am inside LoginDemoSteps_PF class =====");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }
    @And("user is on login page")
    public void user_is_on_login_page() {
        driver.navigate().to("https://example.testproject.io/web/");
        loginPage_pf = new LoginPage_PF(driver);
    }
    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) {
        loginPage_pf.enterUsername(username);
        loginPage_pf.enterPassword(password);
    }
    @And("user clicks on login")
    public void user_clicks_on_login() {
        homePage_pf = loginPage_pf.clickOnLogin();
    }
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {
        homePage_pf.checkLogoutIsDisplayed();
    }


}
