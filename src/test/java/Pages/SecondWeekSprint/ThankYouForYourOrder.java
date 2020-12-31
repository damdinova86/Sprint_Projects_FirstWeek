package Pages.SecondWeekSprint;

import Pages.FirstWeekSprint.BasePage;
import org.openqa.selenium.By;

public class ThankYouForYourOrder extends BasePage {

    By thankYou = By.xpath("//div[@class='col order-instruction']//h2[text()='Thank You for Your Order!']");
    By orderNum = By.xpath("//div[@class='sec-info-module sec-rco-content cart-section-header']//h2[text()='ORDER RECEIPT REFERENCE # ']");


    public boolean isDisplayedThankYou() {
        return isDisplayed(thankYou);
    }

    public boolean isDisplayedReferenceNumber() {
        return isDisplayed(orderNum);
    }


}
