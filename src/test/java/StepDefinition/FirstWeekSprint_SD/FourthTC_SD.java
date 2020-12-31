package StepDefinition.FirstWeekSprint_SD;

import Pages.FirstWeekSprint.FourthTC_LandingPage;
import Pages.FirstWeekSprint.MyAccountPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class FourthTC_SD extends FourthTC_LandingPage {
    MyAccountPage mPage= new MyAccountPage();


    @Then("^click on school box to get autosuggestion$")
    public void clickBox(){
    clickBoxToGetAutoSug();
    }



    @Then("I verify same school address is present as selected  while creating the account")
    public void verifySchoolAddress(){
        String schoolAddress= "ADAK SCHOOL\n" +
                "118 E INTL AIRPORT RD\n" +
                "ANCHORAGE, AK\n" +
                "99518";
        Assert.assertEquals(schoolAddress, mPage.address(),"Different addresses");
    }

}
