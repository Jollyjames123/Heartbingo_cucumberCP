package co.uk.heartbingo.pages;

import co.uk.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//iframe[@class='oneauth-iframe']")
    WebElement iframe;
    @CacheLookup
    @FindBy(xpath = "//input[@id='username']")
    WebElement userNameLink;

    @CacheLookup
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordLink;

    @CacheLookup
    @FindBy(xpath = "//button[@name='login_submit']")
    WebElement loginButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"__next\"]/form/div[3]/span")
    WebElement actualErrorMsgLink;


    public void verifyLoginPage() {
        String curUrl = driver.getCurrentUrl();
        Assert.assertTrue(curUrl.contains("login"));
    }

    public void loginWithInvalidCredentials(String userName, String password) {

        driver.switchTo().frame(iframe);

        pmSendTextToElement(userNameLink, userName);
        pmSendTextToElement(passwordLink, password);
    }

    public void clickOnLoginButton() {
        pmClickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return pmGetTextFromElement(actualErrorMsgLink);
    }
}
