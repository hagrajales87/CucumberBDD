package pageFactory;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Slf4j
public class LoginPage_PF {

    private WebDriver driver;

    @FindBy(id = "name")
    @CacheLookup
    WebElement txt_username;

    @FindBy(id = "password")
    WebElement txt_password;

    @FindBy(id = "login")
    WebElement btn_login;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterUsername(String username) {
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password) {
        txt_password.sendKeys(password);
    }

    public HomePage_PF clickOnLogin() {
        btn_login.click();
        return new HomePage_PF(driver);
    }

}
