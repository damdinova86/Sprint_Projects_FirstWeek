package StepDefinition;

import Pages.HomePage;
import Pages.ThirdTC_LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ThirdTC_SD extends HomePage {

    ThirdTC_LandingPage tPage = new ThirdTC_LandingPage();


    @When("^I click Sign In$")
    public void clickSignIn() {
        tPage.signIn();
    }

    @When("^type email address username '(.+)'$")
    public void email(String data) {
        tPage.typeEmail(data);
    }

    @When("^type password '(.+)'$")
    public void password(String data) {
        tPage.typePassword(data);
    }

    @When("^click Sign in$")
    public void signIn() {
        tPage.clickSignIn();
    }

    @When("^click close the curtains$")
    public void closeFrame() {
        tPage.closePopUpOnAccountPage();
    }

    @When("^close small PopUp$")
    public void closePopUp() {
        tPage.closeSmallPopUp();
    }


    @Then("^type '(.+)' in search box$")
    public void typeHarry(String data) {
        tPage.typeText(data);
    }

    @Then("^click magnifying glass$")
    public void clickSearch() {
        tPage.clickSearchBook();
    }


//    @Then("^scroll down$")
//    public void scrollDown() {
//        tPage.scroll();
//    }


    @Then("^click Quick look on any book$")
    public void quickLook() {
        tPage.clickQuickLook();
    }


    @Then("^save item name in Quick look$")
    public void saveItemName() {
        tPage.getTextUnderQuickLook();
    }



    @Then("^click star button$")
    public void clickStarButton() {
        tPage.clickStar();
    }

    @Then("^click Recommendations  to students$")
    public void clickCheckBox() {
        tPage.clickCheckBox();
    }

    @Then("^done click close Add to My Lists$")
    public void closeMyList() {
        tPage.closeList();
    }


    @Then("^close Quick look box$")
    public void closeQuickLook() {
        tPage.closeWindow();
    }

    @Then("^click My Lists$")
    public void clickMyList() {
        tPage.MyList();
    }

    @Then("^click Recommendations for Students$")
    public void clickRecommendations() {
        tPage.recommendation();
    }


    @Then("^verify if name of the item is the same under  Myn List and Recommendations  to Students$")
    public void verifyNameOfTheItem() {

        Assert.assertEquals(tPage.textUnderQuickLook, tPage.getName(), "Item names are different");
    }

}
