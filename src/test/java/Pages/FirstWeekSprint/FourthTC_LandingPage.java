package Pages.FirstWeekSprint;

import org.openqa.selenium.By;

public class FourthTC_LandingPage extends BasePage {

    By clickInBoxtoGetAutoSugg = By.id("dwfrm_searchschool_schoolvalue");



    public void clickBoxToGetAutoSug(){
        clickThis(clickInBoxtoGetAutoSugg);
        sleepMethod();
    }


}