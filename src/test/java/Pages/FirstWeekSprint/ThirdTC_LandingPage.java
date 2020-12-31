package Pages.FirstWeekSprint;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ThirdTC_LandingPage extends BasePage {
    public String textUnderQuickLook;

    By signIn = By.xpath("//a[@class='signin pureguest dialog-close disable-autoplay']");
    By email = By.id("dwfrm_login_username");
    By password = By.id("dwfrm_login_password");
    By signInPage = By.id("loginModalBtn");
    By closeWindow = By.xpath("//span[@class='header-message']");
    By navToCloseAlert = By.xpath("//div[@class='cool-alert']");
    By closeSmallPopUp = By.xpath("//div[@class='tooltipster-title']//span[@class='tooltipster-close ']");
    By typeInSearch = By.xpath("//input[@data-placeholder='Search by Title, Author, Item # or Keyword']");
    By search = By.xpath("//i[@class='fa fa-search']");
    By image = By.xpath("//img[@title='Harry Potter and the Deathly Hallows']");
    By quickLook = By.xpath("//a[@title='Harry Potter and the Deathly Hallows']/following-sibling::a[@class='quickview']");
    By getTextFromQuickLook = By.xpath("//span[@class='product-attribution']/preceding::a[contains(@class,'product-name')]");
    By getText = By.xpath("//a[contains(text(),'Harry Potter and the Deathly Hallows')]");
    By star = By.xpath("//span[@class='icon-button-icon']//i[contains(@class,'star')]");
    By checkBox = By.xpath("//div[text()='Recommendations to Students']/preceding::input[@value='recommended']");
    By closeAddToMyList = By.xpath("//span[@class='tooltipster-close ']");
    By srollUp = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
    By myList = By.xpath("//span[text()='My Lists']");
    By recommend = By.xpath("//li[@class='recommend']");

//    By nameUnderMyList = By.xpath("//td[@class='add-anote']/preceding::div[@class='product-list-item']");


    public void signIn() {
        clickThis(signIn);
    }

    public void typeEmail(String data) {
        waitUntilElementVisible(email);
        enter(email, data);
    }

    public void typePassword(String data) {
        enter(password, data);

    }

    public void clickSignIn() {
        clickThis(signInPage);
        sleepMethod();
    }

    public void closePopUpOnAccountPage() {
      waitUntilClickable(closeWindow);
        Web.getDriver().findElement(closeWindow).click();

    }

    public void closeSmallPopUp() {
        sleepMethod();
        clickThis(closeSmallPopUp);
    }

    public void typeText(String data) {
        sleepMethod();
        enter(typeInSearch, data);
    }

    public void clickSearchBook() {
        clickThis(search);
    }


    public void clickQuickLook() {
        WebElement toLoc = Web.getDriver().findElement(image);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(toLoc);
        act.perform();
        sleepMethod();

        clickThis(quickLook);
        sleepMethod();
    }

    public String getTextUnderQuickLook() {
        sleepMethod();
        sleepMethod();
        textUnderQuickLook = getText(getTextFromQuickLook);
        return textUnderQuickLook;
    }

    public void clickStar() {
        sleepMethod();
        clickThis(star);
    }

    public void clickCheckBox() {
        sleepMethod();
        clickThis(checkBox);
    }

    public void closeList() {
        clickThis(closeAddToMyList);
    }


    public void closeWindow() {
        clickThis(srollUp);
    }

    public void MyList() {
        clickThis(myList);
    }

    public void recommendation() {
        clickThis(recommend);
    }

    public String getName() {
        String nameUnderRecommendations = getText(getText);
        System.out.println(nameUnderRecommendations+" second name");
        return nameUnderRecommendations;
    }


}
