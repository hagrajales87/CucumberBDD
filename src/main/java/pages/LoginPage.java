package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

@Slf4j
public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By txt_useName = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    private By logoutButton = By.id("logout");
    private By btn_logout = By.id("logout");


    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public void enterUsername(String username){
        driver.findElement(txt_useName).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void checkLogOutIsDisplayed(){
        driver.findElement(btn_logout).isDisplayed();

        if(!driver.getTitle().equals("TestProject Demo")){
            log.error("This is not Login Page. The Current page is " + driver.getCurrentUrl());
        }
    }

    public void loginValidUser(String username, String password){
        driver.findElement(txt_useName).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
