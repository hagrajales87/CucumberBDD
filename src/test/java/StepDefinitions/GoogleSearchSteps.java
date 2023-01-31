package StepDefinitions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

import static org.junit.Assert.assertTrue;


@Slf4j
public class GoogleSearchSteps {
/*
    private WebDriver driver;
    private WebDriverWait wait;
    private By searchBox = By.cssSelector(".gLFyf[name='q']");
    private By resultTitle = By.xpath("//h3[text()='Imágenes de Hector Grajales']");
    @Given("browser is open")
    public void browser_is_open() {
        log.info("Inside Step - browser is open");
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }

    @And("user is on google search page")
    public void user_is_on_google_search_page() {
        log.info("Inside Step - user is on google search page");
        driver.get("https://google.com");
        log.info("This is the page title: "+driver.getTitle());
        log.info("This is the current URL: "+driver.getCurrentUrl());
    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        log.info("Inside Step - user enters a text in search box");
        wait.until(ExpectedConditions.elementToBeClickable(searchBox));
        driver.findElement(searchBox).sendKeys("Hector Grajales");
        log.info(driver.findElement(searchBox).getText());
    }

    @And("hits enter")
    public void hits_enter() {
        log.info("Inside Step - hits enter");
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }

    @Then("user is navigated to search result")
    public void user_is_navigated_to_search_result() {
        log.info("Inside Step - user is navigated to search results");
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.presenceOfElementLocated(resultTitle));
        var imageTile = driver.findElement(resultTitle).getText();
        assertTrue("Title incorrect",imageTile.contains("Hector Grajales"));
    }

 */
}
