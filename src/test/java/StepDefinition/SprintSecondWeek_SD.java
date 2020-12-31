package StepDefinition;

import Pages.SecondWeekSprint.*;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class SprintSecondWeek_SD {

    ThankYouForYourOrder pPage = new ThankYouForYourOrder();
    SFO_Page sPage = new SFO_Page();
    YTO_Page yPage = new YTO_Page();
    ReviewYourCart_Page rPage = new ReviewYourCart_Page();
    Checkout_Page cPage = new Checkout_Page();
    ShippingPayment spPage = new ShippingPayment();

    //TC12

    @Then("^Verify if Your Estimated Tax is zero for non-tax State school$")
    public void VerifyTaxIsZero() {
        cPage.yourEstimateTax();
        double taxNumber = cPage.taxNum;
        Assert.assertEquals(taxNumber, 0.0, "tax not equal to zero");


    }



    // TC13
    @Then("^I click Your Teacher Order and click By Flyer$")
    public void clickYTO() {
        yPage.clickYTO();
    }

    @Then("^add quantity for one book '(.+)' and click Review Cart$")
    public void addQuantityAndClickReview(String data) {
        yPage.addQty(data);
    }


    @Then("^click proceed to checkout second time click proceed to checkout$")
    public void checkout() {
        rPage.proceedToCheckout();
    }

    @Then("^Verify if there tax greater than zero$")
    public void verifyTax() {
        cPage.yourEstimateTax();
        double taxNumber = cPage.taxNum;
        Assert.assertTrue(taxNumber > 0, "tax number is not greater than zero");


    }


    //TC15
    @Then("^click continue checkout$")
    public void contCheckOut() {
        rPage.continueCheckOut();
    }

    @Then("^click Ship To MySchool$")
    public void clickShipToMySchool() {
        spPage.clickShipToMySchool();
    }


    @Then("^click Select Payment Method$")
    public void clickPaymentMethod() {
        spPage.selectPaymentMethod();
    }

    @Then("^enter a new credit card number '(.+)'$")
    public void enterCreditCardInfo(String data) {
        spPage.creditCardInfo(data);
    }

    @Then("^click enter expiration date$")
    public void enterExpirationDate() {
        spPage.expDate();
    }

    @Then("^enter CVN code '(.+)'$")
    public void enterCVN(String data) {
        spPage.enterSecurityCode(data);
    }

    @Then("^enter first name '(.+)'$")
    public void enterFirstName(String data) {
        spPage.enterFirstN(data);
    }

    @Then("^enter last name '(.+)'$")
    public void enterLastName(String data) {
        spPage.enterLastN(data);
    }

    @Then("^type address1 '(.+)'$")
    public void enterAddress(String data) {
        spPage.enterAddress(data);
    }

    @Then("^enter zipcode (.+)'$")
    public void enterZipCode(String data) {
        spPage.enterZipCode(data);
    }

    @Then("^enter phone number (.+)'$")
    public void enterPhoneNumber(String data) {
        spPage.enterPhone(data);
    }

    @Then("^click CheckOut and submit$")
    public void contCheckOutSecTime() {
        spPage.continueCheckOutSecTime();
    }

    @Then("^Verify if Thank you message is displayed$")
    public void thankYouIsDisp() {
        pPage.isDisplayedThankYou();
    }

    @Then("^Verify if Order Receipt Reference number is displayed$")
    public void referenceIsDisp() {
        pPage.isDisplayedReferenceNumber();
    }


}
