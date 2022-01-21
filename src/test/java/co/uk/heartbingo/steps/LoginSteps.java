package co.uk.heartbingo.steps;

import co.uk.heartbingo.pages.HomePage;
import co.uk.heartbingo.pages.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("^User is on home page$")
    public void userIsOnHomePage() {
    }

    @When("^User clicks on Login button$")
    public void userClicksOnLoginButton() {

        new HomePage().clickOnLogin();
    }

    @Then("^verify user is on Login page$")
    public void verifyUserIsOnLoginPage() {

        new LoginPage().verifyLoginPage();
    }


    @And("^enters username and password \"([^\"]*)\" \"([^\"]*)\"$")
    public void entersUsernameAndPassword(String email, String password)  {
new LoginPage().loginWithInvalidCredentials(email, password);

    }

    @And("^Clicks on Login button to login$")
    public void clicksOnLoginButtonToLogin() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^verifies the error message \"([^\"]*)\"$")
    public void verifiesTheErrorMessage(String errorMessage)  {
        Assert.assertEquals("Message is displayed correctly", errorMessage, new LoginPage().getErrorMessage());

    }
}
