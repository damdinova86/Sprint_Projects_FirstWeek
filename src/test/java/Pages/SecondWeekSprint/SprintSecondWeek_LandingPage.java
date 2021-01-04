package Pages.SecondWeekSprint;

import org.openqa.selenium.By;

public class SprintSecondWeek_LandingPage extends BasePage {
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
