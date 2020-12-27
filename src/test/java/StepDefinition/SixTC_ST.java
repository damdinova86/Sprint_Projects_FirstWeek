package StepDefinition;

import Pages.SixTC_LandingPage;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SixTC_ST {
    SixTC_LandingPage sPage = new SixTC_LandingPage();

    @When("^Navigate to enter orders$")
    public void enterOrder(){
        sPage.navEnterOrder();

    }

    @When("^click to Student Fryer Orders$")
    public void clickFryerOrder(){
        sPage.clickStudentFryerOrder();

    }

    @When("^enter '(.+)'$")
    public void enterName(String data){
        sPage.enterNameBox(data);
    }
    @When("^enter item number '(.+)'$")
    public void enterItemNum(String data){
        sPage.enterItemNumber(data);
    }

    @When("^click Add$")
    public void clickAdd(){
        sPage.clickAdd();

    }

    @When("^I verify teacher gets error for invalid item number$")
    public void verifyErrorMessage(){
        String message= "Please enter a valid item number.";
        Assert.assertEquals(message, sPage.getTextError(), "Not the same error");

    }
}
