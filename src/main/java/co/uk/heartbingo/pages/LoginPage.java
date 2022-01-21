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

    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //to initialise webelements @findby annotations for this page
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
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"));
        log.info("Verifying the Login page with URL: "+ currentUrl );
    }

    public void loginWithInvalidCredentials(String userName, String password) {

        driver.switchTo().frame(iframe);
        log.info("Switching to iframe: "+ iframe.toString());

        pmSendTextToElement(userNameLink, userName);
        log.info("Entering username: "+ userName );
        pmSendTextToElement(passwordLink, password);
        log.info("Entering password: "+ password );
    }

    public void clickOnLoginButton() {
        pmClickOnElement(loginButton);
        log.info("Clicking on the login button: "+ loginButton.toString());
    }

    public String getErrorMessage() {
        log.info("Reading the error message: "+ actualErrorMsgLink.getText() );
        return pmGetTextFromElement(actualErrorMsgLink);
    }
}
