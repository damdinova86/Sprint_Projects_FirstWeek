package Pages.FirstWeekSprint;

import DriverWrapper.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class BasePage {
    public String nameOfLocation;
    public WebElement findElementUsingFluentWait(final By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public void clickThis(By locator){
        findElementUsingFluentWait(locator).click();
    }

    public String getWebpageTitle(){
        return Web.getDriver().getTitle();
    }

    public void enter(By locator, String text) {
        findElementUsingFluentWait(locator).sendKeys(text);
    }

    public void selectFromAutoSuggestion(By locator, String word) {
        List<WebElement> suggestions = Web.getDriver().findElements(locator);
        for (WebElement suggestion : suggestions) {
            if (suggestion.getText().equalsIgnoreCase(word)) {
                suggestion.click();
                break;
            }
        }
    }

    public String getText(By locator){
        return findElementUsingFluentWait(locator).getText();
    }

    public void selectFromDropdown(By locator, String word){
        WebElement elem= findElementUsingFluentWait(locator);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select name = new Select(elem);
        name.selectByValue(word);
    }

    public void sleepMethod(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isDisplayed(By locator){
       return findElementUsingFluentWait(locator).isDisplayed();
    }

    public void hoverOver(By locator) {
        WebElement moveTo = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(moveTo).build().perform();
    }

    public void moveToElement(By locator) {
        WebElement moveTo = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(moveTo).perform();
    }

    public void scroll(By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }


    public void waitUntilElementVisible(By locator){
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitUntilClickable(By locator){
        WebDriverWait wait = new WebDriverWait(Web.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(locator));}




}





