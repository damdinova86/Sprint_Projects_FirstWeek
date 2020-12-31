package Pages.FirstWeekSprint;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SecondTS_LandingPage extends BasePage {

    By schoolState = By.xpath("//div[@class='selected-option input-select']");
    By allStates = By.xpath("//li[@class='custom-option select-option']");
    By cityBox = By.id("dwfrm_myschool_schoolcity");
    By selectCity = By.xpath("//span[@class='ui-menu-item-wrapper']//span[@class='auto-matches']");
    By clickSearch = By.xpath("//button[@class='button-continue']");
    By toScroll = By.xpath("//div[@class='ps-scrollbar-y']");
    By ny = By.xpath("//li[@data-label='new york']");

    public void state() {
        clickThis(schoolState);
        WebElement navigateToState = Web.getDriver().findElement(toScroll);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(navigateToState).build().perform();
    }

    public void scroll() {
        WebElement element = Web.getDriver().findElement(ny);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void selectState(String word) {
        selectFromAutoSuggestion(allStates, word);
        sleepMethod();
    }

    public void city(String word) {
        enter(cityBox, word);
        sleepMethod();
    }

    public void selectFromCity(String word) {
        selectFromAutoSuggestion(selectCity, word);
        sleepMethod();
    }
    public void clickSearch() {
        clickThis(clickSearch);
    }
}
