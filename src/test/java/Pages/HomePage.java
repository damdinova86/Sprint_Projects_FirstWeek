package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {


    By closePopUp = By.xpath("//span[@class='header-message']");
    By classCode = By.xpath("//div[text()='View & Submit']/preceding::div[@class='value']");
    By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']");
    By profile = By.xpath("//a[@title='Profile']");

    public void closeFrameOnAccountPage() {
        Web.getDriver().findElement(closePopUp).click();

    }

    public void saveClassCode() {
        getText(classCode);
    }

    public void clickMyAccount() {
        clickThis(myAccount);
        clickThis(profile);
    }

}
