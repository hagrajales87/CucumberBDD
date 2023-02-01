package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

@Slf4j
public class HooksDemoSteps {

    private WebDriver driver;

    @Before(value= "@smoke", order=2)
    public void browserSetup() {
        log.info(" I am inside browserSetup");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Before("smoke")
    public void setUp2(){
        System.out.println("I am inside setup2 \n");
    }

    @After(order=1)
    public void teardown() {
        log.info("  I am inside tear down ");
        driver.close();
        driver.quit();
    }

    @After(order=2)
    public void teardown2() {
        log.info("  I am inside tear down2 \n ");

    }

    @BeforeStep
    public static void beforeSteps() {
        log.info(" I am inside before Step");
    }

    @AfterStep
    public static void afterSteps() {
        log.info(" I am inside after Step");
    }

    @Given("user is on login page")
    public void user_is_on_login_page() {
        driver.get("https://example.testproject.io/web/");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {

    }

    @When("clicks on login button")
    public void clicks_on_login_button() {

    }

    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page() {

    }
}
