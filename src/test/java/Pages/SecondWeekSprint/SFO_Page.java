package Pages.SecondWeekSprint;

import Pages.FirstWeekSprint.BasePage;
import org.openqa.selenium.By;

public class SFO_Page extends BasePage {


    By studentName = By.id("student-name");
    By itemNumber = By.id("item-number");
    By add = By.id("btn-add");
    By error = By.id("error-message-tooltip");


    public void enterNameBox(String word) {
        enter(studentName, word);

    }

    public void enterItemNumber(String word) {
        enter(itemNumber, word);
    }

    public void clickAdd() {
        clickThis(add);
        sleepMethod();
    }

    public String getTextError() {
        String errorMessage = getText(error);
        return errorMessage;
    }


}
