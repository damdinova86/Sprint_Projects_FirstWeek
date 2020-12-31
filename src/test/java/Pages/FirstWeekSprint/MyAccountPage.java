package Pages.FirstWeekSprint;

import DriverWrapper.Web;
import org.openqa.selenium.By;

public class MyAccountPage extends BasePage {

    By classCode = By.xpath("//div[@class='classcode']");
    By teacherName = By.xpath("//h3[contains(text(),'Email')]/preceding::div[@class='text-blk']");
    By address1 = By.xpath("//div[@class='school-section']//div[@class='text-blk']");


    public String getClassCodeOnMyAcc(){
        String classCodeAll= Web.getDriver().findElement(classCode).getText();
       String code = classCodeAll.substring(classCodeAll.indexOf("\n")+1);
        System.out.println(code);
        return code;

    }



    public String teacherName() {
        return getText(teacherName);
    }

    public String address() {
        String fullAddress = getText(address1);
        System.out.println(fullAddress);
        return fullAddress;

    }


}
