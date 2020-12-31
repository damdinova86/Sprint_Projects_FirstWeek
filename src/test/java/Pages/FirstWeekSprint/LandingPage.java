package Pages.FirstWeekSprint;

import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    By creatAcc = By.xpath("//div[@id='navLinksOnly']/preceding::a[@class='create-account-trigger']");
    By teacherAcc = By.xpath("//label[@for='acccountTeacther']");
    By clickNext = By.id("linkChooseAcount");
    By title = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By selectMr = By.xpath("//li[@data-label='mr.']");
    By inputFirstName = By.id("dwfrm_profile_customer_firstname");
    By inputLastName = By.id("dwfrm_profile_customer_lastname");
    By inputEmail = By.id("dwfrm_profile_customer_email");
    By inputPassword = By.id("dwfrm_profile_login_password");
    By check = By.id("dwfrm_registration_termsofuseteacher");
    By next = By.xpath("//button[@class='button-continue']");
    By zipCode = By.id("dwfrm_myschool_schoolzip");
    By clickSearch = By.id("button-search");
    By typeSchool = By.id("dwfrm_searchschool_schoolvalue");
    By school = By.xpath("//span[@class='ui-menu-item-wrapper']");
    By click = By.xpath("//button[@class='next-button button-continue school-search']");
    By role = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By grade = By.xpath("//span[text()='Teacher (by Grade)']");
    By clickToChooseGrade = By.xpath("//div[@class='selected-option input-select noscroll']");
    By selectGrade = By.xpath("//li[@data-label='1st grade']");
    By numStudents = By.id("dwfrm_myrole_students");
    By clickNextRole = By.xpath("//button[@class='next-button button-continue']");
    By clickReadingLevel = By.xpath("//div[@class='selected-option input-select required']");
    By guidedLevel = By.xpath("//span[text()='Guided Reading Level (GRL)']");
    By clickContinue = By.xpath("//button[@class='button-continue']");


    public void clickCreatAnAcc() {
        clickThis(creatAcc);
    }

    public void chooseTeacher() {
        clickThis(teacherAcc);
        sleepMethod();
    }

    public void clickNextButton() {
        clickThis(clickNext);
    }

    public void clickSelectTitle() {
        clickThis(title);
    }

    public void chooseTitleMs() {
        clickThis(selectMr);
        sleepMethod();
    }


    public void typeFirstName(String fistName) {
        enter(inputFirstName, fistName);
    }

    public void typeLastname(String lastName) {
        enter(inputLastName, lastName);
    }

    public void typeEmail(String email) {
        waitUntilElementVisible(inputEmail);
        enter(inputEmail, email);
    }

    public void typePassword(String password) {
        enter(inputPassword, password);
    }

    public void clickCheckMark() {
        clickThis(check);
    }

    public void clickNext() {
        clickThis(next);
    }

    public void typeZipCode(String word) {
        enter(zipCode, word);
    }

    public void clickSearch() {
        clickThis(clickSearch);
    }

    public void typeInTheBox(String word) {
        enter(typeSchool, word);
        sleepMethod();
    }


    public void selectFromAutoS(String word) {
        selectFromAutoSuggestion(school, word);
        sleepMethod();
    }

    public void clickN() {
        clickThis(click);
    }

    public void clickRoleButton() {
        clickThis(role);
        clickThis(grade);
    }

    public void gradeFirst() {
        clickThis(clickToChooseGrade);
        sleepMethod();
        clickThis(selectGrade);

    }

    public void numberOfSt(String word) {
        enter(numStudents, word);
    }

    public void clickNextOnRole() {
        clickThis(clickNextRole);
    }

    public void readingLevelSystem() {
        clickThis(clickReadingLevel);
        clickThis(guidedLevel);
    }

    public void clickContinue() {
        clickThis(clickContinue);
        sleepMethod();
    }


}
