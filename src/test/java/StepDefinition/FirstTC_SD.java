package StepDefinition;

import Pages.LandingPage;
import Pages.HomePage;
import Pages.MyAccountPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class FirstTC_SD {
    LandingPage lPage = new LandingPage();
    HomePage mPage = new HomePage();
    MyAccountPage nPage = new MyAccountPage();

    @Given("^I am on scholastic landing page$")
    public void launchWebPage() {
    }

    @When("^I click 'Create an Account'$")
    public void clickCreateAnAcc() {
        lPage.clickCreatAnAcc();
    }

    @When("^Choose 'Teacher/Administrator/Homeschooler' from the option$")
    public void clickTeacherOption() {
        lPage.chooseTeacher();
    }


    @When("^click Next$")
    public void clickNext() {
        lPage.clickNextButton();
    }


    @When("^click 'Select Title'$")
    public void clickSelectTitle() {
        lPage.clickSelectTitle();
    }

    @Then("^I choose 'Ms' from dropdown Title$")
    public void chooseTitle() {
        lPage.chooseTitleMs();

    }


    @When("^Type my first name '(.+)'$")
    public void inputFirstName(String word) {
        lPage.typeFirstName(word);
    }

    @When("^Type my last name '(.+)'$")
    public void inputLastN(String word) {
        lPage.typeLastname(word);
    }

    @When("^Type my email address '(.+)'$")
    public void inputEmail(String word) {
        lPage.typeEmail(word);
    }

    @When("^Type password '(.+)'$")
    public void inputPassword(String word) {
        lPage.typePassword(word);
    }

    @When("^click in the box I have read and accept the Terms of Use and Privacy Policy.$")
    public void clickBox() {
        lPage.clickCheckMark();
    }

    @When("^click Next on the button$")
    public void nextClick() {
        lPage.clickNext();
    }

    @Then("^enter zip code '(.+)'$")
    public void enterZip(String word) {
        lPage.typeZipCode(word);
    }

    @Then("^click Search$")
    public void clickSearchOnButton() {
        lPage.clickSearch();
    }


    @Then("^type '(.+)'$")
    public void typeSchool(String word) {
        lPage.typeInTheBox(word);

    }

    @Then("^Choose from dropdown '(.+)'$")
    public void chooseFromAutoS(String word) {
        lPage.selectFromAutoS(word);

    }


    @Then("^click Next on school page$")
    public void click() {
        lPage.clickN();
    }

    @Then("^Choose under the Role 'Teacher by Grade'$")
    public void clickRole() {
        lPage.clickRoleButton();
    }

    @Then("^Choose 1st Grade under Grade$")
    public void grade() {
        lPage.gradeFirst();
    }

    @Then("^type '(.+)' under the number of Students$")
    public void numStudents(String word) {
        lPage.numberOfSt(word);
    }

    @Then("^Click Next on My Role$")
    public void nextOnRole() {
        lPage.clickNextOnRole();
    }

    @Then("Under preferred reading level system: choose 'Guided Reading Level GRL'")
    public void readingLevel() {
        lPage.readingLevelSystem();
    }

    @Then("^Click Continue to site$")
    public void clickContinueToSite() {
        lPage.clickContinue();
    }

    @Then("^click close the alert$")
    public void closeFrame() {
        mPage.closeFrameOnAccountPage();
    }

    @Then("^I save class code on Home-Page$")
    public void ClassCodeOnHomePage() {
        mPage.saveClassCode();
    }

    @Then("^click My account and click Profile from dropdown$")
    public void myAccount() {
        mPage.clickMyAccount();
    }


    @Then("^I verify if class code under MyAccount-Page is the same as on my Home-Page$")
    public void verifyClassCode() {
        Assert.assertTrue(nPage.isClassCodeDisp(), "It is not the same");
    }

    @Then("I verify  if the same Teacher name is present on My Account")
    public void verifyTeacherName() {
        String teacherName = "Mr. Bal Damdinova";
        Assert.assertEquals(teacherName, nPage.teacherName(), "Different name");
    }

    @Then("^I verify same school address is present as selected  while creating the account.$")
    public void verifySchoolAddress() {
        String schoolAddress = "568 Broadway # 2 New York, NY 10012";
        Assert.assertEquals(schoolAddress, nPage.address(), "Different addresses");
    }
}
