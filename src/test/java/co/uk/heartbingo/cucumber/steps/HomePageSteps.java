package co.uk.heartbingo.cucumber.steps;

import co.uk.heartbingo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageSteps {
    @When("^User hovers over Bingo tab$")
    public void userHoversOverBingoTab() {

    }

    @Then("^can verify that Bingo tab is displayed$")
    public void canVerifyThatBingoTabIsDisplayed() {
        new HomePage().verifyBingoTab();
    }

    @And("^hovers over Jackpots Tab$")
    public void hoversOverJackpotsTab() {
    }

    @And("^can verify that Jackpots Tab is displayed$")
    public void canVerifyThatJackpotsTabIsDisplayed() {
        new HomePage().verifyJackpotsTab();
    }

    @And("^hovers over Slots Tab$")
    public void hoversOverSlotsTab() {
        new HomePage().verifySlotsTab();
    }

    @And("^can verify that Slots Tab is displayed$")
    public void canVerifyThatSlotsTabIsDisplayed() {
    }

    @And("^hovers over Casino Tab$")
    public void hoversOverCasinoTab() {
        new HomePage().verifyCasinoTab();
    }

    @And("^can verify that Casino Tab is displayed$")
    public void canVerifyThatCasinoTabIsDisplayed() {
    }

    @And("^hovers over Promos Tab$")
    public void hoversOverPromosTab() {
    }

    @And("^can verify that Promos Tab is displayed$")
    public void canVerifyThatPromosTabIsDisplayed() {
        new HomePage().verifyPromosTab();
    }
}
