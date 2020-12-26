package StepDefinition;

import Pages.MyAccountPage;
import Pages.SecondTS_LandingPage;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class SecondTC_SD {
    SecondTS_LandingPage sPage= new SecondTS_LandingPage();
    MyAccountPage  mPage = new MyAccountPage();

    @Then("^click Select School State$")
    public void clickState(){
        sPage.state();
    }

    @Then("^Scroll down to get New York State$")
    public void scrollDown(){
        sPage.scroll();
    }

    @Then("^In Search By State and city choose '(.+)' under State box$")
    public void selectState(String word){
        sPage.selectState(word);
    }

    @Then("^Type '(.+)' in City box$")
    public void typeCity(String word){
        sPage.city(word);
    }

    @Then("^Select from Autosuggestion '(.+)'$")
    public void selectCity(String word){
        sPage.selectFromCity(word);
    }

    @Then("^click Search after fill out city$")
    public void clickSearch(){
        sPage.clickSearch();
    }

    @Then("^I verify school address is present as selected  while creating the account.$")
    public void verifySchoolAddress() {
        String schoolAddress = "SCHOLASTIC+BOOK+CLUBS\n" +
                "568 Broadway # 2\n" +
                "New York, NY\n" +
                "10012";
        Assert.assertEquals(schoolAddress, mPage.address(), "Different addresses");
    }
}
