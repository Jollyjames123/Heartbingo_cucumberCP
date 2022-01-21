package co.uk.heartbingo.pages;

import co.uk.heartbingo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log In']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Bingo']")
    WebElement bingoButton;
    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Bingo']")
    WebElement bingo;

    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Jackpots']")
    WebElement jackpots;

    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Slots']")
    WebElement slots;

    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Casino']")
    WebElement casino;

    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Promos']")
    WebElement promos;


    public void clickOnLogin() {
       // driver.switchTo().frame(iframe);
        pmWaitWithThreadSleep(20);
       pmClickOnElement(loginButton);
       // driver.switchTo().defaultContent();
    }
    public void verifyBingoTab(){
        pmMouseHoverNoClick(bingo);
        Assert.assertTrue(bingo.isDisplayed());
        log.info("Verify Bingo tab : " );
    }
    public void verifyJackpotsTab(){
        pmMouseHoverNoClick(jackpots);
        Assert.assertTrue(jackpots.isDisplayed());
        log.info("Verify Jackpots tab : " );
    }
    public void verifySlotsTab(){
        pmMouseHoverNoClick(slots);
        Assert.assertTrue(slots.isDisplayed());
        log.info("Verify Slots tab : " );
    }
    public void verifyCasinoTab(){
        pmMouseHoverNoClick(casino);
        Assert.assertTrue(casino.isDisplayed());
        log.info("Verify Casino tab : " );
    }
    public void verifyPromosTab(){
        pmMouseHoverNoClick(promos);
        Assert.assertTrue(promos.isDisplayed());
        log.info("Verify Promos tab : " + promos.isDisplayed() );
    }

}
