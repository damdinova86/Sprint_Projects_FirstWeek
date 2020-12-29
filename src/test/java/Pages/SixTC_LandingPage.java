package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SixTC_LandingPage extends BasePage{
    By enterOrder= By.xpath("(//a[@id='enter-orders'])[2]");
    By studentFlyerOrder = By.xpath("(//li[@id='student-flyer-orders'])[2]");
    By studentName = By.id("student-name");
    By itemNumber =  By.id("item-number");
    By add= By.id("btn-add");
    By error = By.id("error-message-tooltip");


    public void navEnterOrder(){
        hoverOver(enterOrder);
       sleepMethod();
    }

    public void clickStudentFryerOrder(){
        sleepMethod();
        moveToElement(studentFlyerOrder);
        clickThis(studentFlyerOrder);
    }

    public void enterNameBox(String word){
        enter(studentName, word);
        sleepMethod();
    }

    public void enterItemNumber(String word){
        enter(itemNumber, word);
    }

    public void clickAdd(){
        clickThis(add);
        sleepMethod();
    }

    public String getTextError(){
        String errorMessage = getText(error);
        return errorMessage;
    }
}
