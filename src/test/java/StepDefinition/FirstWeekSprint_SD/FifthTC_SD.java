package StepDefinition.FirstWeekSprint_SD;

import Pages.FirstWeekSprint.Fifth_LandingPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class FifthTC_SD {
    Fifth_LandingPage fPage = new Fifth_LandingPage();

    @Then("^click add a card$")
    public void clickAddCard() {
        fPage.addACard();
    }


    @Then("^I type credit card number '(.+)'$")
    public void typeCreditCard(String data) {
        fPage.typeCard(data);
    }

    @Then("^choose from dropdown expiration date$")
    public void expirationDate() {
        fPage.clickExpirationDate();
    }


    @Then("^type security code '(.+)'$")
    public void typeSSCode(String data) {
        fPage.typeSecCode(data);
    }

    @Then("^type first name '(.+)'$")
    public void typeFirstN(String data) {
        fPage.typeFirstName(data);
    }

    @Then("^type last name '(.+)'$")
    public void typeLastN(String data) {
        fPage.typeLastName(data);
    }

    @Then("^type address '(.+)'$")
    public void typeAddress1(String data) {
        fPage.typeAddress(data);
    }

    @Then("^type zipcode '(.+)'$")
    public void typeZipCode(String data) {
        fPage.typeZipCode(data);
    }

    @Then("^type phone number '(.+)'$")
    public void typePhoneNumber(String data) {
        fPage.typePhone(data);
    }

    @Then("^click save$")
    public void clickSave() {
        fPage.clickSave();
    }


    @Then("^click add a card second time$")
    public void clickAddSecTimeCard() {
        fPage.clickAddCard();
    }

    @Then("^Verify that you will see error message You can only store three credit cards$")
    public void verifyMessage() {
        String message = "You can only store three credit cards";
        Assert.assertEquals(message, fPage.getTextMess(), "Message is different");
    }

}
