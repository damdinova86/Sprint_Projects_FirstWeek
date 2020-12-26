package StepDefinition;

import Pages.SecondTS_LandingPage;
import cucumber.api.java.en.Then;

public class SecondTC_SD {
    SecondTS_LandingPage sPage= new SecondTS_LandingPage();

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
}
