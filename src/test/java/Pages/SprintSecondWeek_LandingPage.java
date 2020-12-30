package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SprintSecondWeek_LandingPage extends BasePage{
    By enterOrder= By.xpath("(//a[@id='enter-orders'])[2]");
    By studentFlyerOrder = By.xpath("(//li[@id='student-flyer-orders'])[2]");


    public void navEnterOrder(){
        hoverOver(enterOrder);
       sleepMethod();
    }

    public void clickStudentFryerOrder(){
     waitUntilElementVisible(studentFlyerOrder);
        moveToElement(studentFlyerOrder);
        waitUntilElementVisible(studentFlyerOrder);
        clickThis(studentFlyerOrder);
    }


}
