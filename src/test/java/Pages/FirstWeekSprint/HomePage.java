package Pages.FirstWeekSprint;

import DriverWrapper.Web;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    By closePopUp = By.xpath("//span[@class='header-message']");
    By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']");
    By profile = By.xpath("//a[@title='Profile']");
    By classCodeOnMyAcc= By.xpath("//div[contains(text(),'View & Submit')]/preceding::div[@class='value']");


    public void closeFrameOnAccountPage() {
        Web.getDriver().findElement(closePopUp).click();
    }
    public void clickMyAccount() {
        sleepMethod();
        clickThis(myAccount);
        clickThis(profile);
    }

    public String saveClassCode() {
        sleepMethod();
      String code= getText(classCodeOnMyAcc);
        System.out.println(code);
      return code;
    }




}
