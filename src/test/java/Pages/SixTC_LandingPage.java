package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SixTC_LandingPage extends BasePage{
    By enterOrder= By.id("enter-orders");
    By studentFryerOrder = By.xpath("//div[@class='sidecarmenu-overlay']/preceding::li[@id='student-online-orders']/preceding::li[@id='student-flyer-orders']");
    By studentName = By.id("student-name");
    By itemNumber =  By.id("item-number");
    By add= By.id("btn-add");
    By error = By.id("error-message-tooltip");


    public void navEnterOrder(){
        sleepMethod();

        WebElement  moveTo = Web.getDriver().findElement(enterOrder);
        Actions act= new Actions(Web.getDriver());
        act.moveToElement(moveTo).perform();


    }

    public void clickStudentFryerOrder(){
        clickThis(studentFryerOrder);
    }

    public void enterNameBox(String word){
        enter(studentName, word);
    }

    public void enterItemNumber(String word){
        enter(itemNumber, word);
    }

    public void clickAdd(){
        clickThis(add);
    }

    public String getTextError(){
        String erorrMessage = getText(error);
        return erorrMessage;
    }
}
