package StepDefinition;

import Pages.SFO_Page;
import Pages.SprintSecondWeek_LandingPage;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class SixTC_ST {
    SprintSecondWeek_LandingPage sPage = new SprintSecondWeek_LandingPage();
    SFO_Page sfoPage = new SFO_Page();

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
        sfoPage.enterNameBox(data);
    }
    @When("^enter item number '(.+)'$")
    public void enterItemNum(String data){
        sfoPage.enterItemNumber(data);
    }

    @When("^click Add$")
    public void clickAdd(){
        sfoPage.clickAdd();

    }

    @When("^I verify teacher gets error for invalid item number$")
    public void verifyErrorMessage(){
        String message= "Please enter a valid item number.";
        Assert.assertEquals(message, sfoPage.getTextError(), "Not the same error");

    }
}
