package Pages;

import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    By classCode = By.xpath("//div[@class='classcode']");
    By teacherName = By.xpath("//h3[contains(text(),'Email')]/preceding::div[@class='text-blk']");
    By address1 = By.xpath("//span[contains(text(),'568 Broadway # 2')]");
    By address2 = By.xpath("//span[@class='city-school']");
    By address3 = By.xpath("//span[@class='zip-school']");


    public boolean isClassCodeDisp() {
        return isDisplayed(classCode);

    }

    public String teacherName() {
        return getText(teacherName);
    }

    public String address() {
        String fullAddress = getText(address1) + " " + getText(address2) + " " + getText(address3);
        return fullAddress;
    }


}
